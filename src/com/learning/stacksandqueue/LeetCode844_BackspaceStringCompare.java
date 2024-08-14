package com.learning.stacksandqueue;

import java.util.Stack;

public class LeetCode844_BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {
        Stack<String> s1 = new Stack<>();
        Stack<String> s2 = new Stack<>();
        for (String letter : s.split("")) {
            if (letter.equals("#")) {
                if (!s1.isEmpty()) {
                    s1.pop();
                }
            } else
                s1.push(letter);
        }
        for (String letter : t.split("")) {
            if (letter.equals("#")) {
                if (!s2.isEmpty()) {
                    s2.pop();
                }
            } else
                s2.push(letter);
        }
        return s1.equals(s2);
    }
}
