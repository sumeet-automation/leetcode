package com.learning.strings;

public class LeetCode214_ShortestPalidndrome {

    public String shortestPalindrome(String s) {
        int length=s.length();
        StringBuilder rev = new StringBuilder(s).reverse();
        for (int i = 0; i < s.length(); i++) {
            if (rev.substring(i).contentEquals(s.substring(0, length - i))) {
                return rev.substring(0, i) + s;
            }
        }
        return "";
    }


}
