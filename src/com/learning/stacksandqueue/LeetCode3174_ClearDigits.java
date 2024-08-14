package com.learning.stacksandqueue;

import java.util.Stack;
import java.util.stream.Collectors;

public class LeetCode3174_ClearDigits {

    public static void main(String[] args) {
        clearDigitsSB("ab34");
    }
    public static String clearDigitsSB(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                System.out.println(i);
                System.out.println(sb);
                sb.deleteCharAt(sb.length()-1);
            } else {
                System.out.println("else  -----  "+i);
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                stack.pop();
            } else stack.push(s.charAt(i));
        }
        return stack.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(""));
    }
}
