package com.learning.array;

import java.util.Arrays;

public class Question22_MoveZeroes {

    public static void main(String[] args) {
        int[] nums = {0,2, 9, 0, 14, 13, 0, 9};
        //moveZeroes(nums);
        moveZeroesOptimize(nums);
        System.out.println(Arrays.toString(nums));
    }
    //2,1,0,14,13,0,9
    //2,1,14,0,13,0,9
    //2,1,14,13,0,0,9
    //2,1,14,13,0,9,0
    public static void moveZeroes(int[] nums) {
        int left=0, right=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[right] == 0) {
                right++;
            } else {
                nums[left++] = nums[right++];
            }
        }
        Arrays.fill(nums,left,nums.length,0);
    }

    public static void moveZeroesOptimize(int[] nums) {
        int left=0;
        for (int right = 0; right < nums.length; right++)
            if (nums[right] != 0)
                nums[left++] = nums[right];
        Arrays.fill(nums,left,nums.length,0);
    }
}
