package com.learning.twopointers;

import java.util.Arrays;

public class LeetCode80_RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        removeDuplicates(new int[]{1, 1, 1, 2, 2, 3});
    }

    public static int removeDuplicates(int[] nums) {
        //1,1,2,2,3,3,3,4
        /*int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (k<2 || nums[i] != nums[i - 2]) {
                nums[k++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;*/

        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (k < 2 || nums[i] != nums[k - 2]) {
                nums[k++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }
}