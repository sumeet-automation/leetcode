package com.learning.maths;

import java.util.Arrays;

public class LeetCode1317_ConvertIntegersIntoSumOfTwoNumbers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getNoZeroIntegers(10100)));
    }
    public static int[] getNoZeroIntegers(int n) {
        int left = 1, right = n - 1;
        while (true) {
            if (!String.valueOf(right).contains("0") && left + right == n && !String.valueOf(left).contains("0")) {
                return new int[]{left, right};
            } else {
                left++;
                right--;
            }
        }
    }
}
