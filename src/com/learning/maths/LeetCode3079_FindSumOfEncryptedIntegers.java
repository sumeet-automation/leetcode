package com.learning.maths;

import java.util.Arrays;

public class LeetCode3079_FindSumOfEncryptedIntegers {

    public static void main(String[] args) {
        LeetCode3079_FindSumOfEncryptedIntegers solution = new LeetCode3079_FindSumOfEncryptedIntegers();
        System.out.println(solution.sumOfEncryptedInt(new int[]{109}));
    }
    public int sumOfEncryptedInt(int[] nums) {
        return Arrays.stream(nums).map(this::allNumWithMaxDigit).sum();
    }

    private int allNumWithMaxDigit(int num) {
        int length=0;
        int maxDigit=Integer.MIN_VALUE;
        while (num > 0) {
            int digit = num % 10;
            maxDigit = Math.max(maxDigit, digit);
            num/=10;
            length++;
        }
        System.out.println(length+" ----"+maxDigit);
        int num1 = maxDigit;
        if (length == 2) {
            return maxDigit * 11;
        } else if (length == 3) {
            return maxDigit * 111;
        } else return maxDigit;
    }
}
