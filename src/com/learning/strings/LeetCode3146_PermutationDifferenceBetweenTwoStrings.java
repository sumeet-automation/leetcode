package com.learning.strings;

public class LeetCode3146_PermutationDifferenceBetweenTwoStrings {

    public static void main(String[] args) {
        System.out.println(findPermutationDifference("abc", "bac"));
    }

    public static int findPermutationDifference(String s, String t) {
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            sum+=Math.abs(i - t.indexOf(s.charAt(i)));
        }
        return sum;
    }
}
