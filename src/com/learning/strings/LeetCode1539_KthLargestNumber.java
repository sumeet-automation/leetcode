package com.learning.strings;

public class LeetCode1539_KthLargestNumber {

    public int findKthPositive(int[] arr, int k) {
        int lastValue = arr[arr.length - 1] + k + 1;
        int missing = 0;
        for (int i = 1, idx = 0; i < lastValue && k != 0; i++) {
            if (idx < arr.length && arr[idx] != i) {
                k--;
                missing = i;
            } else if (idx >= arr.length) {
                k--;
                missing = i;
            } else {
                System.out.println("here");
                idx++;
            }
        }
        return missing;
    }

}
