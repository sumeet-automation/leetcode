package com.learning.hashtable;

public class LeetCode2414_LengthOfTheLongestAlphabeticalContinuousSubstring {

    //aabca
    public static void main(String[] args) {
        LeetCode2414_LengthOfTheLongestAlphabeticalContinuousSubstring solution = new LeetCode2414_LengthOfTheLongestAlphabeticalContinuousSubstring();
        System.out.println(solution.longestContinuousSubstring("aabcde"));
    }

    public int longestContinuousSubstring(String s) {
        int maxLength = 1;
        int currentMaxLength = 1;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i + 1) - s.charAt(i) == 1) {
                currentMaxLength++;
                maxLength = Math.max(maxLength, currentMaxLength);
            } else {
                currentMaxLength = 1;
            }
        }
        return maxLength;
    }
}