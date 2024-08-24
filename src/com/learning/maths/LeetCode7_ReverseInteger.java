package com.learning.maths;

public class LeetCode7_ReverseInteger {

    public static void main(String[] args) {
        reverse(321);
        reverse(-123);
        reverse(0);
        System.out.println(reverse(-2147483647));
    }

    public static int reverse(int x) {
        int number = 0;
        while (x !=0 ) {
            int rem = x % 10;
            if(number>Integer.MAX_VALUE/10 || number<Integer.MIN_VALUE/10) return 0;
            x = x / 10;
            number=(number*10)+rem;
        }
        return  number;
    }
}
