package com.learning.strings;
public class LeetCode2047_NumberOfValidWords {

    public int countValidWords(String sentence) {
        int ans = 0;
        for (String s : sentence.split(" ")) {
            ans += check(s);
        }
        return ans;
    }

    private int check(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        boolean st = false;
        for (int i = 0; i < s.length(); ++i) {
            if (s.matches(".*\\d.*")) {
                return 0;
            }
            if ((s.charAt(i) == '!' || s.charAt(i) == '.' || s.charAt(i) == ',') && i < s.length() - 1) {
                return 0;
            }
            if (s.charAt(i) == '-') {
                if (st || i == 0 || i == s.length() - 1) {
                    return 0;
                }
                if (!Character.isAlphabetic(s.charAt(i - 1)) || !Character.isAlphabetic(s.charAt(i + 1))) {
                    return 0;
                }
                st = true;
            }
        }
        return 1;
    }
}

