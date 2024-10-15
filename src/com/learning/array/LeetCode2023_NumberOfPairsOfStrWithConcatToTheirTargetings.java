package com.learning.array;

public class LeetCode2023_NumberOfPairsOfStrWithConcatToTheirTargetings {

    public int numOfPairs(String[] nums, String target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && (nums[i] + nums[j]).equals(target)) count++;
            }
        }
        return count;
    }
}
