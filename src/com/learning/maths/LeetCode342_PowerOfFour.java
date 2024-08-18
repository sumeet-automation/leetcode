package com.learning.maths;

public class LeetCode342_PowerOfFour {

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
        System.out.println(isPowerOfFour(17));
    }

    public static boolean isPowerOfFour(int n) {
        double ans = Math.log(n)/Math.log(4);
        return ans%1==0;
    }
}
