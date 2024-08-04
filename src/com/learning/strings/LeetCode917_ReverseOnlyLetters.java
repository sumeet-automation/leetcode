package com.learning.strings;

public class LeetCode917_ReverseOnlyLetters {

    public static void main(String[] args) {
        String s = "Test1ng-Leet=code-Q!";
        System.out.println(reverseOnlyLetters(s));
    }
    public static String reverseOnlyLetters(String s) {
        String withoutLetters = s.replaceAll("[^a-zA-Z]", "");
        System.out.println(s);
        String reverse = "";
        for (int i = withoutLetters.length()-1; i >= 0; i--) {
            reverse += withoutLetters.charAt(i);
        }
        System.out.println(reverse);
        StringBuilder sb = new StringBuilder();
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            System.out.println(String.valueOf(s.charAt(i)).matches("[a-zA-Z]"));
            if (!String.valueOf(s.charAt(i)).matches("[a-zA-Z]")) {
                sb.insert(i, s.charAt(i));
            } else {
                sb.insert(i, reverse.charAt(count++));
            }
        }
        return sb.toString();
    }
}
