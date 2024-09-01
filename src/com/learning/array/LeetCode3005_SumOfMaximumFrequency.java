package com.learning.array;

import java.util.Arrays;
public class LeetCode3005_SumOfMaximumFrequency {

    public static void main(String[] args) {
        LeetCode3005_SumOfMaximumFrequency solution = new LeetCode3005_SumOfMaximumFrequency();
        System.out.println(solution.maxFrequencyElements(new int[]{10, 20, 10, 20, 10, 20}));
    }

    public int maxFrequencyElements(int[] nums) {
        int[] output = new int[100];
        for (int num : nums) {
            output[num - 1]++;
        }
        Arrays.sort(output);
        int sum = output[output.length - 1];
        for (int i = output.length - 1; i >= 0; i--) {
            if (output[i] != output[i - 1]) {
                return sum;
            } else sum += output[i];
        }
        return sum;
    }
}
