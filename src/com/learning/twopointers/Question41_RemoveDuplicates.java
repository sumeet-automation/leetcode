package com.learning.twopointers;

import java.util.Arrays;

public class Question41_RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,4};
        removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int count = 1;
        int left=0,right=1;
        while (right < nums.length) {
            if (nums[left] != nums[right]) {
                nums[count++] = nums[right];
                left=right;
                right++;
            } else {
                nums[left+1]=nums[right];
                right++;
            }
        }
        return count;
    }
}
