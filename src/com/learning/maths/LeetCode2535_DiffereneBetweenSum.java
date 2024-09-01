package com.learning.maths;

import java.util.Arrays;

public class LeetCode2535_DiffereneBetweenSum {

    public static void main(String[] args) {
        LeetCode2535_DiffereneBetweenSum solution = new LeetCode2535_DiffereneBetweenSum();
        solution.differenceOfSum(new int[]{1, 15, 6, 3});
    }

    public int differenceOfSum(int[] nums) {
        int sum = 0, digitSums=0;
        for (int num : nums) {
            sum+=num;
            while (num != 0) {
                int digit = num % 10;
                digitSums += digit;
                num = num / 10;
            }
        }
        return Math.abs(sum-digitSums);
    }
    public int differenceOfSum2(int[] nums) {
        int digitSums = 0;
        for (int num : nums) {
            digitSums+=sumOfDigits(num);
        }
        System.out.println(digitSums);
        int sum = Arrays.stream(nums).sum();
        return Math.abs(sum-digitSums);
    }

    public int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        return sum;
    }
}
