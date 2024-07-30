package com.learning.twopointers;

import java.util.Arrays;

public class Question42_SortColorArray {

    public static void main(String[] args) {
        int[] nums = new int[]{1,0, 0, 1, 1, 2, 2};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        //5
        //1 1 2 2 0 0
        //0 --> 2
        int ones = 0, zeroes = 0;
        for (var num : nums) {
            if (num == 1) ones++;
            if (num == 0) zeroes++;
        }
        Arrays.fill(nums,0,nums.length,0);
        Arrays.fill(nums, 0, nums.length - zeroes , 0);
        Arrays.fill(nums, zeroes, nums.length, 1);
        Arrays.fill(nums, zeroes + ones, nums.length, 2);
    }
}
