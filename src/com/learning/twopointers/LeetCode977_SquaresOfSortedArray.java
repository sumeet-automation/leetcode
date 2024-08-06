package com.learning.twopointers;

import java.lang.management.ManagementFactory;
import java.util.Arrays;

public class LeetCode977_SquaresOfSortedArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
    }

    public static int[] sortedSquares(int[] nums) {
        //[-4, -1, 0, 3, 10]
        //[0,1,9,16,100]
        int[] output = new int[nums.length];
        int left = 0, right = nums.length - 1;
        int count = right;
        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                output[count--] = nums[left] * nums[left];
                left++;
            } else{
                output[count--] = nums[right] * nums[right];
                right--;
            }
        }
        return output;
    }
}
