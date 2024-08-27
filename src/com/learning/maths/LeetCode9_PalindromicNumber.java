package com.learning.maths;

public class LeetCode9_PalindromicNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
        if(x<0) return false;
        final int xCopy = x;
        int rev=0;
        while (x!=0){
            int digit = x%10;
            x=x/10;
            rev = (rev*10)+digit;
        }
        return rev==xCopy;
    }
}
