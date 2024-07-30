package com.learning.strings;

public class LeetCode1528_ShuffleString {

    public static void main(String[] args) {
        System.out.println(restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}));
    }

    public static String restoreString(String s, int[] indices) {
        char[] output = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            output[indices[i]] = s.charAt(i);
        }
        return new String(output);
    }
}
