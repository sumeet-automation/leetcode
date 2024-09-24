package com.learning.binarysearch;

public class LeetCode704_BinarySearch {

    public static void main(String[] args) {
        LeetCode704_BinarySearch solution = new LeetCode704_BinarySearch();
        System.out.println(solution.search(new int[]{-5, -3, 0, 3, 5, 9, 11, 13, 15}, 11));
    }

    private boolean search( int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid]==target){
                return true;
            }else if (nums[mid] > target) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return false;
    }
}
