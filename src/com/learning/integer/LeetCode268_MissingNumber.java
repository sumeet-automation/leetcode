package com.learning.integer;

import java.util.Arrays;

public class LeetCode268_MissingNumber {

    public static void main(String[] args) {
        missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1});

    }

    public static int missingNumber(int[] nums) {
        int maxNumber = nums.length;
        int sum = (maxNumber*(maxNumber+1))/2;
        return sum - Arrays.stream(nums).sum();

    }
}
