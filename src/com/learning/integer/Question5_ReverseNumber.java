package com.learning.integer;

/*
Reverse Integer
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.



Assume the environment does not allow you to store 64-bit integers (signed or unsigned).



Example 1:

Input: x = 123

Output: 321



Example 2:

Input: x = -123

Output: -321



Example 3:

Input: x = 120

Output: 21
 */
public class Question5_ReverseNumber {

    public static void main(String[] args) {
        System.out.println(reverse(13));
    }

    public static int reverse(int x) {
        if (x > Integer.MIN_VALUE) return 0;
        int reverse = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            reverse = (reverse * 10) + lastDigit;
            x /= 10;
        }
        return reverse > Integer.MAX_VALUE ? 0 : reverse;
    }

}
