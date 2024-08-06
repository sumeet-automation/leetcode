package com.learning.integer;

import java.util.Arrays;

public class LeetCode136_SingleNumber {

    public int singleNumber(int[] nums) {
        int output = nums[0];
        for (int i = 1; i < nums.length; i++) {
        output ^= nums[i];
        }
        return output;
    }
}
