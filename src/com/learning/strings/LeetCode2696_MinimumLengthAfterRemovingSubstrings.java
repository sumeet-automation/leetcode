package com.learning.strings;

import java.util.Stack;

public class LeetCode2696_MinimumLengthAfterRemovingSubstrings {
    public static void main(String[] args) {
        //System.out.println(minLength("ABFCACDB"));
        System.out.println(minLengthStack("ABFCACDB"));
    }

    public static int minLengthStack(String s) {
        Stack<Character> stk = new Stack<>();
        stk.push(' ');
        for (char c : s.toCharArray()) {
            if ((c == 'B' && stk.peek() == 'A') || (c == 'D' && stk.peek() == 'C')) {
                stk.pop();
            } else {
                stk.push(c);
            }
        }
        return stk.size() - 1;
    }
    public static int minLength(String s) {
        StringBuilder sb = new StringBuilder(s);
        int idx1 = sb.indexOf("AB");
        int idx2 = sb.indexOf("CD");
        while (idx1 != -1 || idx2 != -1) {
            //System.out.println(sb);
            if (idx1 != -1) {
                sb = sb.delete(idx1, idx1 + 2);
                System.out.println("1 --- " + sb+" -- "+idx1);
            } else if (idx2 != -1) {
                System.out.println("2 ---" + sb+" --- "+idx2);
                sb = sb.delete(idx2, idx2 + 2);
            }
            System.out.println(sb);
            idx1 = sb.indexOf("AB");
            idx2 = sb.indexOf("CD");

        }
        return sb.length();
    }
}
