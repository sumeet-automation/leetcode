package com.learning.strings;

import java.util.Stack;

public class LeetCode3696_RemoveAB_CD {

    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && ch == 'B' && stack.peek() == 'A') stack.pop();
            else if (!stack.isEmpty() && ch == 'D' && stack.peek() == 'C') stack.pop();
            else stack.push(ch);
        }
        return stack.size();
    }

    //read - write

    public int minLength2(String s) {
        char[] chars = s.toCharArray();
        int write = 0;
        for (int read = 0; read < s.length(); read++) {
            if (write == 0) {
                chars[write] = chars[read];
                write++;
                continue;
            }
            if (chars[read] == 'B' && chars[write - 1] == 'A') write--;
            else if (chars[read] == 'D' && chars[write - 1] == 'C') write--;
            else {
                chars[write] = chars[read];
                write++;
            }
        }
        return write;
    }

}
