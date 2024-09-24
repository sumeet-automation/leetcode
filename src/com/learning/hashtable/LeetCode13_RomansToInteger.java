package com.learning.hashtable;

import java.util.Map;

public class LeetCode13_RomansToInteger {

    public int romanToInt2(String s) {

        int answer = 0, prev = 0;

        for (int j = s.length() - 1; j >= 0; j--) {
            int number = switch (s.charAt(j)) {
                case 'M' ->  1000;
                case 'D' ->  500;
                case 'C' ->  100;
                case 'L' ->  50;
                case 'X' ->  10;
                case 'V' ->  5;
                case 'I' ->  1;
                default -> 0;
            };
            if (number < prev) {
                answer -= number;
            }
            else {
                answer += number;
            }
            prev = number;
        }
        return answer;
    }
    public int romanToInt(String s) {
        Map<Character, Integer> romans = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
        int output = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && romans.get(s.charAt(i)) < romans.get(s.charAt(i + 1))) {
                output += romans.get(s.charAt(i + 1)) - romans.get(s.charAt(i));
                i++;
            } else {
                output += romans.get(s.charAt(i));
            }
        }
        return output;
    }
}
