package com.learning.strings;

public class LeetCode459_RepeatedSubstringPattern {

    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("aaaaa"));
    }
    public static boolean repeatedSubstringPattern(String s) {
        for (int i = 1; i < s.length(); i++) {
            int length = (s.length()-i)/i;
            if( s.substring(0, i).repeat(length).equals(s.substring(i))) return true;
        }
        return false;
    }
}
