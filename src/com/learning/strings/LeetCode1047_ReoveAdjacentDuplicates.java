package com.learning.strings;

import java.util.Stack;
import java.util.stream.Collectors;

public class LeetCode1047_ReoveAdjacentDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }
    public static String removeDuplicates(String s) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && stack.peek().equals(String.valueOf(s.charAt(i)))) {
                stack.pop();
            } else stack.push(String.valueOf(s.charAt(i)));
        }
        return stack.stream().collect(Collectors.joining());
    }
}
