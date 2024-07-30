package com.learning.strings;

public class LeetCode796_RotateString {

    public static void main(String[] args) {
        rotateString("abcde", "bcdea");
    }

    public static boolean rotateString(String s, String goal) {
        for (int i = 1; i < s.length(); i++) {
            if ((s.substring(i) + s.substring(0, i)).equals(goal))
                return true;
        }
        return false;
    }
}
