package com.learning.maths;

import java.util.Arrays;

public class LeetCode1295_FindNumbersOfEvenNumberOfDigits {

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int digitCount = 0;
            while (num != 0) {
                int digit = num % 10;
                num /= 10;
                digitCount++;
            }
            if (digitCount % 2 == 0) count++;
        }
        return count;
    }

    public int findNumbers2(int[] nums) {
        return (int) Arrays.stream(nums).map(x -> String.valueOf(x).length()).filter(x -> x % 2 == 0).count();
    }

}