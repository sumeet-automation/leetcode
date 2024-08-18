package com.learning.maths;

public class LeetCode136_SingleNumber {

    public int singleNumber(int[] nums) {
        int output = nums[0];
        for (int i = 1; i < nums.length; i++) {
        output ^= nums[i];
        }
        return output;
    }
}
