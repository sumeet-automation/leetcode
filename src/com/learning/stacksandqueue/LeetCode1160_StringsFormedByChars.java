package com.learning.stacksandqueue;

import java.util.Arrays;

public class LeetCode1160_StringsFormedByChars {

    public static void main(String[] args) {
        String[] words = {"cat", "bat", "hat"};
        String chars = "atach";
        System.out.println(countCharacters(words, chars));
    }

    public static int countCharacters(String[] words, String chars) {
        int[] count = new int[26];
        for (int i = 0; i < chars.length(); i++) {
            count[chars.charAt(i) - 'a']++;
        }
        int length = 0;
        for (String word : words) {
            int[] countCopy = Arrays.copyOf(count, count.length);
            boolean test = true;
            for (int i = 0; i < word.length(); i++) {
                if (countCopy[word.charAt(i) - 'a'] > 0) {
                    countCopy[word.charAt(i) - 'a']--;
                } else {
                    test = false;
                    break;
                }
            }
            if (test) length += word.length();
        }
        return length;
    }
}
