package com.learning.array;

public class Leetcode35_SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int index=-1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target || nums[i]>target) {
                return i;
            }
        }
        return nums.length;
    }
}
