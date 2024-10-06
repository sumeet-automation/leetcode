package com.learning.simulation;

public class LeetCode985_SumofEvenNumbersAfterQueries {

    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] result = new int[nums.length];
        for (int i = 0; i < queries.length; i++) {
            int queryAddition = queries[i][0];
            int queryIndex= queries[i][1];
            nums[queryIndex] += queryAddition;
            int sum = 0;
            for (int num : nums) {
                if(num%2==0) sum += num;
            }
            result[i] = sum;
        }
        return result;
    }
}
