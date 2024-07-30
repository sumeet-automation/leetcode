package com.learning.integer;

/*

Palindrome Number
Given an integer, return true if the given integer is a palindrome and false otherwise.

Example 1:

Input: x = 121

Output: true

Explanation: 121 reads as 121 from left to right and from right to left.



Example 2:

Input: x = -121

Output: false

Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.



Example 3:

Input: x = 10

Output: false

Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

Follow up: Could you solve it without converting the integer to a string?
 */
public class Question3_Palindrome {


    /*
    122 -->
     1) 122%10 ==>2 122 /10 ==> 12 output = 2
    2) 12 %10 ==> 2 12/10 ==> 1 output 2+ 2*10
     */

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        int temp = x;
        if (x < 0 || x==0) return false;
        int reverse = 0;
        while (x!=0) {
            int lastDigit = x%10;
            x/=10;
            reverse = (reverse*10)+lastDigit;
            System.out.println(reverse);
        }
        return (reverse^temp)==0;
    }
}
