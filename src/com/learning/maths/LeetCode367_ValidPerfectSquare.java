package com.learning.maths;

import java.nio.charset.MalformedInputException;
import java.util.stream.IntStream;

public class LeetCode367_ValidPerfectSquare {

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(25));
        System.out.println(isPerfectSquare(19));
    }

    public static boolean isPerfectSquare(int num) {
        //19...9...4
        int left = 1, right = num;
        while (left<right) {
            // >>>1 is same as (left + right)/2 but is used to avoid overflow
            int mid = (left + right) >>> 1;
            if(1L* mid*mid>=num) right=mid;
            else left = mid + 1;
        }
        return left*left==num;
    }
}
