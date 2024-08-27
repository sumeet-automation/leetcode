package com.learning.strings;

import java.util.HashMap;
import java.util.Map;

public class LeetCode583_DeleteOperationForTwoStrings {

    public static void main(String[] args) {
        System.out.println(minDistance("sea", "ate"));
    }
    public static int minDistance(String word1, String word2) {
        int[] word1Array = new int[26];
        for (char c : word1.toCharArray()) {
            word1Array[c - 'a']++;
        }

        int[] word2Array = new int[26];
        for (char c : word2.toCharArray()) {
            word2Array[c - 'a']++;
        }
        int distance = 0;
        for (int i = 0; i < 26; i++) {
            if (word1Array[i] != word2Array[i]) {
                distance += Math.abs(word1Array[i] - word2Array[i]);
            }
        }
        return distance;
    }
}
