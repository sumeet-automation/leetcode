package com.learning.array;

import java.util.Arrays;

public class LeetCode3289_TwoSneakyNumbersfDigitville {

    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int[] ans = new int[2];
        for (int i = 1,j=0; i < nums.length; i++) {
            if (nums[i]==nums[i-1]){
                ans[j++] = nums[i++];
            }
        }
        return ans;
    }
}
