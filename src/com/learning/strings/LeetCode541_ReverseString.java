package com.learning.strings;

public class LeetCode541_ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 3));
    }
    public static String reverseStr(String s, int k) {
        return "";
    }

    public static String reverse(String s) {
        String output = "";
        for (int i = s.length()-1; i >= 0; i--) {
            output += s.charAt(i);
        }
        return output;
    }
}
