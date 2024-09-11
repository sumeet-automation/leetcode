package com.learning.maths;

public class LeetCode3190_MinimumOperationToDivideBy3 {

    public int minimumOperations(int[] nums) {
        int count=0;
        for (int num : nums) {
            if (num % 3 != 0) {
                count++;
            }
        }
        return count;
    }
}
