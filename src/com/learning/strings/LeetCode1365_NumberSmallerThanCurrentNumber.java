package com.learning.strings;

public class LeetCode1365_NumberSmallerThanCurrentNumber {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count=0;
            for (int j = 0; j < nums.length; j++) {
                if(i!=j && nums[j]<nums[i])
                    count++;
            }
            output[i] = count;
        }
        return output;
    }
}
