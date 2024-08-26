package com.learning.strings;

public class LetCode2697_LexicographicallySmallestPalindromeEasyTopics {

    public static void main(String[] args) {
        System.out.println(makeSmallestPalindrome("afbec"));
        System.out.println(makeSmallestPalindromeAgain("afbec"));
    }

    public static String makeSmallestPalindrome(String s) {
        char[] output = new char[s.length()];
        int left = 0, right = s.length() - 1;
        while (left <= right) {
            output[left] = output[right] = (char) Math.min(s.charAt(left), s.charAt(right));
            left++;
            right--;
        }
        return new String(output);
    }

    public static String makeSmallestPalindromeAgain(String s) {
        char[] output = new char[s.length()];
        for (int left = 0, right = s.length() - 1; left <= right; left++, right--) {
            output[left] = output[right] = (char) Math.min(s.charAt(left), s.charAt(right));
            ;
        }
        return new String(output);
    }
}
