package com.learning.strings;

import java.util.HashSet;
import java.util.Set;

public class LeetCode1309_IntegerToAlphabetMapping {

    public static void main(String[] args) {
        LeetCode1309_IntegerToAlphabetMapping solution = new LeetCode1309_IntegerToAlphabetMapping();
        System.out.println(solution.freqAlphabets("10#11#12"));
        System.out.println(solution.freqAlphabets("1326#"));
    }

    public String freqAlphabets(String s) {
        Set<Integer> indices = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') indices.add(i);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (indices.contains(i + 2)) {
                int c1 = s.charAt(i) - '0';
                int c2 = s.charAt(i + 1) - '0';
                int digit = (c1 * 10) + c2;
                char x = (char) ('a' + digit-1);
                i = i + 2;
                sb.append(x);
            } else {
                int c = s.charAt(i) - '1';
                char x = (char) ('a' + c);
                sb.append(x);
            }
        }
        return sb.toString();
    }
}
