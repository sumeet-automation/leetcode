package com.learning.strings;

import java.util.Arrays;
import java.util.List;

public class LeetCode2710_RemoveTrailingZerosFromString {
    public String removeTrailingZeros(String num) {
        int count=0;
        for (int i = num.length() - 1; i >= 0; i--) {
            if (String.valueOf(num.charAt(i)).equals("0")) {
                count++;
            } else {
                break;
            }
        }
        return num.substring(0, num.length() - count);
    }

    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        List<String> vowels = List.of("a", "e", "i", "o", "u");
        long count1 = Arrays.stream(s.substring(0, s.length() / 2).split(""))
                .filter(x->vowels.contains(x)).count();
        long count2 = Arrays.stream(s.substring(s.length() / 2).split(""))
                .filter(x->vowels.contains(x)).count();
        return count1 == count2;
    }
}
