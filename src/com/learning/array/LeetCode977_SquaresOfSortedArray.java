package com.learning.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LeetCode977_SquaresOfSortedArray {

    public static void main(String[] args) {
        LeetCode977_SquaresOfSortedArray solution = new LeetCode977_SquaresOfSortedArray();
        System.out.println(Arrays.toString(solution.sortedSquares(new int[]{-4, -1, 0, 2, 3, 6})));
    }
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int right = nums.length - 1;
        int left = 0;
        int index= nums.length-1;
        while (left <= right) {
            if (nums[right] * nums[right] > nums[left] * nums[left]) {
                res[index--] = nums[right] * nums[right];
                right--;
            } else if (nums[right] * nums[right] <= nums[left] * nums[left]) {
                res[index--] = nums[left] * nums[left];
                left++;
            }
        }
        return res;
    }
}
