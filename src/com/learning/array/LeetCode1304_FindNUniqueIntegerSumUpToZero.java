package com.learning.array;

import java.util.Arrays;

public class LeetCode1304_FindNUniqueIntegerSumUpToZero {

    public static void main(String[] args) {
        LeetCode1304_FindNUniqueIntegerSumUpToZero solution = new LeetCode1304_FindNUniqueIntegerSumUpToZero();
        System.out.println(Arrays.toString(solution.sumZero(5)));
        System.out.println(Arrays.toString(solution.sumZero(4)));
    }

    public int[] sumZero(int n) {
        int[] output = new int[n];
        for (int i = 0; i < n / 2; i++) {
            output[i] = (n - i) * 2;
            output[n - i - 1] = -(n - i) * 2;
        }
        return output;
    }
}
