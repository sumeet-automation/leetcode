package com.learning.dynamicprogramming;

public class LeetCode53_MaximumSubArray {
    public  int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = 0;
        for (int num : nums) {
            if (num < 0) {
                currSum = 0;
            } else {
                currSum+=num;
                maxSum = Math.max(maxSum, currSum);
            }
        }
        return maxSum;
    }
}
