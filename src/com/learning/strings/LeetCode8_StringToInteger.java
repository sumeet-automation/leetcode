package com.learning.strings;

import java.util.List;
import java.util.Map;

public class LeetCode8_StringToInteger {

    public static void main(String[] args) {
        LeetCode8_StringToInteger solution = new LeetCode8_StringToInteger();
        System.out.println(solution.myAtoi("-042") + " ---- expec --> -42");
        System.out.println(solution.myAtoi("-042") + " ---- expec --> -42");
        System.out.println(solution.myAtoi("   -042") + " ---- expec --> -42");
        System.out.println(solution.myAtoi("1337c0d3") + " ---- expec --> 1337");
        System.out.println(solution.myAtoi("0-1"+ " ---- expec --> 1337"));
        System.out.println(solution.myAtoi("-91283472332"+ " ---- expec --> 1337"));
    }

    public int myAtoi(String s) {
        if (s == null) return 0;
        final int n = s.length();
        if (n == 0) return 0;
        int i = 0;
        int sign = 0;
        StringBuilder answer = new StringBuilder();
        while (s.charAt(i) == ' ') {
            i++;
            if (i == n) return 0;
        }

        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            sign = 1;
            i++;
        } else
            sign = 1;
        int mul = 1;
        while (i < n && Character.isDigit(s.charAt(i))) {
            if (s.charAt(i) - '0' != 0) {
                answer.append(s.charAt(i) - '0' * mul);
            }
            i++;
        }
        System.out.println(answer);
       // if (answer>Integer.MAX_VALUE)answer
        return (answer.isEmpty()) ? 0: (int) (sign * Long.parseLong(answer.toString()));
    }
}
