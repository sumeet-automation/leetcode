package com.learning.array;

public class LeetCode1929_ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {
        int[] output = new int[nums.length + nums.length];
        for (int i = 0; i < nums.length; i++) {
            output[i] = nums[i];
        }

        for (int i = nums.length; i < output.length; i++) {
            output[i] = nums[i- nums.length];
        }
        return output;
    }
}
