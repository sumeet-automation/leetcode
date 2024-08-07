package com.learning.strings;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

import static java.lang.Character.isDigit;

public class LeetCode1796_SecondLargestDigitInString {
    public int secondHighest(String s) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < s.split("").length; i++) {
            if (isDigit(s.charAt(i))) {
                set.add((int) s.charAt(i) - 48);
            }
        }
        return set.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(-1);
    }
}
