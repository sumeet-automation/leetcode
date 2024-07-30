package com.learning.stacksandqueue;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Question7_ValidParenthesis {

    public static void main(String[] args) {
        System.out.println(isValidParenthesis("(){}"));
    }
        //()[]{}
        //
    public static boolean isValidParenthesis(String s) {
        if(s.length() %2 !=0) return false;
        Map<String, String> map = new HashMap<>();
        map.put("(", ")");
        map.put("[", "]");
        map.put("{", "}");
        Stack<String> stack = new Stack<>();
        for (var letter : s.split("")) {
            if (map.containsKey(letter)) {
                stack.push(letter);
            } else {
                if(stack.isEmpty()) return false;
                String pop = stack.pop();
                if (!map.get(pop).equals(letter)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
