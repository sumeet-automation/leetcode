package com.learning.twopointers;

public class Question40_IsSubsequence {

    public static void main(String[] args) {
        System.out.println(isSubsequence("axc", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        int left = 0;
        int right = 0;
        while (left != s.length() && right < t.length()) {
            if (s.charAt(left++) == t.charAt(right++)) {
                left++;
            }
        }
        System.out.println(left);
        return left == s.length();
    }
}
