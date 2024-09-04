package com.learning.dynamicprogramming;

public class LeetCode5_MaximumSumArray {

    public static void main(String[] args) {
        LeetCode5_MaximumSumArray solution = new LeetCode5_MaximumSumArray();
        System.out.println(solution.maxSubArray(new int[]{1, 2,-1, 3,4}));
    }
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int sum  = 0;
        for (int i=0;i< nums.length;i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}
