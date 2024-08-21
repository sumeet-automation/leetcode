package com.learning.strings;

public class LeetCode2309_GreatestEnglishLetter {
    public static void main(String[] args) {
        greatestLetter("aAqw");
    }

    public static String greatestLetter(String s) {
        boolean[] chars = new boolean[52];
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                chars[s.charAt(i) - 'A' + 26] = true;
            } else if (Character.isLetter(s.charAt(i))) {
                chars[s.charAt(i) - 'a'] = true;
            }
        }
        String output = "";
        for (int i = 0; i < 26; i++) {
            if (chars[i] && chars[i + 26]) {
                char answer = (char) (i + 'A');
                output = String.valueOf(answer);
            }
        }
        return output;
    }
}
