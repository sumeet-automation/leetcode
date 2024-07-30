package com.learning.stacksandqueue;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Question48_ValidPaenthesis {

    public static void main(String[] args) {
        System.out.println(longestValidParenthesis("()(()())"));
    }

    public static int longestValidParenthesis(String s) {
        //(((()))()(())
        int maxLength = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i)==')') {
                stack.pop();
                if (!stack.empty()) {
                    maxLength = Math.max(i - stack.peek(), maxLength);
                } else {
                    stack.push(i);
                }
            } else {
                stack.push(i);
            }
        }
        return maxLength;
    }
}
