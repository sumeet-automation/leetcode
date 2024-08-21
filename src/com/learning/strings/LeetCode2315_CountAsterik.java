package com.learning.strings;

public class LeetCode2315_CountAsterik {

    public static void main(String[] args) {
        System.out.println(countAsterisks("l|*e*et|c**o|*de|"));
    }

    public static int countAsterisks(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') {
                i++;
                while (s.charAt(i) != '|') {
                    if (s.charAt(i) == '*' ) {
                        count++;
                    }
                    i++;
                }
            }
        }
        int asterikCount = 0;
        for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '*' ) {
                        asterikCount++;
                }
            }
        return asterikCount - count;
    }
}