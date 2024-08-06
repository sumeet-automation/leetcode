package com.learning.strings;

public class LeetCode1768_MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {
        int minimumLength = Math.min(word1.length(), word2.length());
        String output = "";
        for (int i = 0; i < minimumLength; i++) {
            output += word1.charAt(i) + String.valueOf(word2.charAt(i));
        }
        return output + (word1.length() > minimumLength ? word1.substring(minimumLength) : word2.substring(minimumLength));
    }
}
