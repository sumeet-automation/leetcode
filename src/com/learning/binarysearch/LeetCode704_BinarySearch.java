package com.learning.binarysearch;

public class LeetCode704_BinarySearch {

    public static void main(String[] args) {
        LeetCode704_BinarySearch solution = new LeetCode704_BinarySearch();
        System.out.println(solution.search(new int[]{-5, -3, 0, 3, 5, 9, 11, 13, 15}, 11));
    }

    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int index = (left + right) / 2;
        while (left <= right) {
            if (nums[index] == target) {
                return index;
            } else if (nums[index] < target) {
                left = index + 1;
            } else if (nums[index] > target) {
                right = index - 1;
            }
            index = (left + right) / 2;
        }
        return -1;
    }
}
