package com.learning.twopointers;

public class Question43_ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isValidPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isValidPalindrome(String s) {
        s=s.replaceAll("[^0-9a-zA-Z]", "").toLowerCase();
        System.out.println(s);
        int left = 0;
        int right = s.length()-1;
        while (left < right) {
            if(s.charAt(left++)!=s.charAt(right--))
                return false;
        }
        return true;
    }
}
