package com.learning.strings;

public class LeetCode2068_CheckWhetherTwoStringsareAlmostEquivalent {

    public static void main(String[] args) {
        LeetCode2068_CheckWhetherTwoStringsareAlmostEquivalent solution = new LeetCode2068_CheckWhetherTwoStringsareAlmostEquivalent();
        solution.checkAlmostEquivalent("aaaa", "bccb");
    }
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] words1Length = new int[26];
        int[] words2Length = new int[26];

        for (char ch : word1.toCharArray()) {
            words1Length[ch -'a']++;
        }

        for (char ch : word2.toCharArray()) {
            words2Length[ch -'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (Math.abs(words1Length[i] - words2Length[i])>=4) {
                return false;
            }
        }
        return true;
    }
}
