package com.learning.strings;

public class LeetCode3110_ScoreOfAString {

    public static void main(String[] args) {
        System.out.println(scoreOfString("zaz"));
    }
    public static int scoreOfString(String s) {
        int sum=0;
        for (int i = 0; i < s.length() - 1; i++) {
            sum+=Math.abs((int) s.charAt(i) - (int) s.charAt(i+1));
        }
        return sum;
    }
}
