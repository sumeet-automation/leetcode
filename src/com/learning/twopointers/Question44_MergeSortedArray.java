package com.learning.twopointers;

import java.util.Arrays;

public class Question44_MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {2,3,0};
        int[] nums2 = {1};
        merge(nums1, 2, nums2, 1);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m - 1;
        int right = n - 1;
        for (int i = nums1.length-1; i >=0; i--) {
            int valueAtLeft = left >= 0 ? nums1[left] : Integer.MIN_VALUE;
            int valueAtRight = right >= 0 ? nums2[right] : Integer.MIN_VALUE;
            if (valueAtLeft > valueAtRight) {
                nums1[i]=valueAtLeft;
                left--;
            } else if (valueAtLeft <= valueAtRight) {
                nums1[i]=valueAtRight;
                right--;
            }
        }
    }
}
