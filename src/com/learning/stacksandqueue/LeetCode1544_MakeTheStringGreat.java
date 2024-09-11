package com.learning.stacksandqueue;

import java.util.Stack;

public class LeetCode1544_MakeTheStringGreat {

    public static void main(String[] args) {
        LeetCode1544_MakeTheStringGreat solution = new LeetCode1544_MakeTheStringGreat();
        System.out.println(solution.makeGood("Pp"));
        System.out.println('B' - 'b');
    }

    public String makeGood(String s) {
        Stack<String> stack = new Stack<>();
        for (String letter : s.split("")) {
            if (!stack.isEmpty() && stack.peek().equalsIgnoreCase(letter) &&
                    Math.abs(stack.peek().charAt(0) - letter.charAt(0)) == 32) {
                stack.pop();
            } else {
                stack.push(letter);
            }
        }
        return String.join("", stack);
    }

    public String makeGoodStringBuilder(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (sb.isEmpty() || Math.abs(sb.charAt(sb.length() - 1) - c) != 32) {
                sb.append(c);
            } else {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }
}
