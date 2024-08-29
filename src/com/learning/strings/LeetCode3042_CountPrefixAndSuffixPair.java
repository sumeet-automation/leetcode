package com.learning.strings;

public class LeetCode3042_CountPrefixAndSuffixPair {

    public static void main(String[] args) {
        LeetCode3042_CountPrefixAndSuffixPair solution = new LeetCode3042_CountPrefixAndSuffixPair();
        System.out.println(solution.countPrefixSuffixPairs(new String[]{"a", "aba", "ababa", "aa"}));
    }

    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j) {
                    if (isPrefixAndSuffix(words[i], words[j])) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private boolean isPrefixAndSuffix(String word1, String word2) {
        return word2.startsWith(word1) && word2.endsWith(word1);
    }
}
