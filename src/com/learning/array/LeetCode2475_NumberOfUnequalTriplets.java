package com.learning.array;

public class LeetCode2475_NumberOfUnequalTriplets {

    public int unequalTriplets(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = i+2; k < nums.length; k++) {
                    if(nums[i] != nums[j]&& nums[i] != nums[k]&& nums[j] != nums[k])
                        count++;
                }
            }
        }
        return count;
    }
}
