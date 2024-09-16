package com.learning.strings;

import java.security.SecureRandom;

public class LeetCode1328_BreakPalindrome {

    public static void main(String[] args) {
        LeetCode1328_BreakPalindrome solution = new LeetCode1328_BreakPalindrome();
        System.out.println(solution.breakPalindrome("abccba"));
        System.out.println(solution.breakPalindrome("aaaa"));
    }
    public String breakPalindrome(String palindrome) {
        if (palindrome.length() < 2) {
            return palindrome;
        }
        char chars[]=palindrome.toCharArray();
        for (int i = 0; i < palindrome.length()/2; i++) {
            if(palindrome.charAt(i)!='a'){
                chars[i] = 'a';
                return new String(chars);
            }
        }
        chars[palindrome.length() - 1] = 'b';
        return new String(chars);
    }
}
