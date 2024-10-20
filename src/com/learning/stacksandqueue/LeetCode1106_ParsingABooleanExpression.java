package com.learning.stacksandqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode1106_ParsingABooleanExpression {

    public static void main(String[] args) {
        LeetCode1106_ParsingABooleanExpression solution = new LeetCode1106_ParsingABooleanExpression();
        System.out.println(solution.parseBoolExpr("&(|(f))"));
    }

    public boolean parseBoolExpr(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char ch : expression.toCharArray()) {
            //System.out.println(ch);
            if (ch != ')') {
                if (ch != ',')
                    stack.push(ch);
            } else {
                List<Character> list = new ArrayList<>();
                System.out.println("here -- " + stack);
                while (stack.peek() != '(') {
                    list.add(stack.pop());
                }
                stack.pop(); // remmoving '('
                //System.out.println("operator - " + stack.pop());
                System.out.println(list);
                char answer = evaluateExpression(list, stack.pop());
                stack.push(answer);
            }
        }
        return stack.peek()=='t';
    }

    private char evaluateExpression(List<Character> list, char operator) {
        if (operator == '&') {
            boolean answer = list.stream().anyMatch(x -> x == 'f');
            return answer ? 'f' : 't';
        } else if (operator == '|') {
            boolean answer = list.stream().anyMatch(x -> x == 't');
            return answer ? 't' : 'f';
        } else {
            return list.getFirst() == 't' ? 'f' : 't';
        }
    }
}
