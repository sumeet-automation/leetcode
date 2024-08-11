package com.learning.strings;

public class LeetCode1684_CountConsistentString {
    public static void main(String[] args) {
        System.out.println(countConsistentStrings("abc",
                new String[]{"aaabbccc","aaacccc","aadccccc"}));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        boolean[] checkArray = new boolean[26];
        for (int i = 0; i < allowed.length(); i++) {
            checkArray[allowed.charAt(i)-97]=true;
        }
        int count=0;
        for (String word : words) {
            boolean flag = true;
            for (int i = 0; i < word.length(); i++) {
                if(!checkArray[word.charAt(i)-97]){
                    flag = false;
                }
            }
            if (flag)
                count++;
        }
        return count;
    }

    public static int countConsistentStringsUsingBruteForce(String allowed, String[] words) {
        int count=0;
        for (String word : words) {
            boolean flag = true;
            for (int i = 0; i < word.length(); i++) {
                if (allowed.indexOf(word.charAt(i)) == -1) {
                    flag = false;
                }
            }
            if (flag)
                count++;
        }
        return count;
    }
}