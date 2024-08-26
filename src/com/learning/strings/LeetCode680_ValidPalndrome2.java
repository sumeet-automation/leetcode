package com.learning.strings;

public class LeetCode680_ValidPalndrome2 {
    public static void main(String[] args) {
        LeetCode680_ValidPalndrome2 pb = new LeetCode680_ValidPalndrome2();
        System.out.println(pb.validPalindrome("acfcddegfffca"));
    }
    public boolean validPalindrome(String s) {
        if (checkPalindrome(s, 0, s.length() - 1)) return true;
        int left = 0, right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return checkPalindrome(s, left + 1, right) || checkPalindrome(s, left, right - 1);
            }
        }
        return true;
    }

    private boolean checkPalindrome(String sb, int left, int right) {
        //int left = 0, right = sb.length() - 1;
        System.out.println(sb);
        while (left <= right) {
            if (sb.charAt(left) != sb.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
