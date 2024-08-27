package com.learning.array;

import java.util.Arrays;
import java.util.Map;

public class LeetCode599_MinimumIndexSumOfTwoLists {

    public static void main(String[] args) {
        findMaxAverage(new int[]{1, 2, 3, 4, 5, 6,20}, 4);
    }

    public static double findMaxAverage(int[] nums, int k) {
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }
        int currSum = maxSum;
        for (int i = 1; i < nums.length - k+1; i++) {
            currSum = currSum - nums[i - 1] + nums[k + i - 1];
            System.out.println(currSum);
            maxSum = Math.max(maxSum, currSum);
        }
        return (double) maxSum/4;
    }
}
