package com.learning.array;

public class LeetCode1480_RunningSum {

    public int[] runningSum(int[] nums) {
        //int[] ans = new int[nums.length];
        //int curr = 0;
        for (int i =1; i < nums.length; i++) {
            nums[i] = nums[i-1] ;
        }
        return nums;
    }
}
