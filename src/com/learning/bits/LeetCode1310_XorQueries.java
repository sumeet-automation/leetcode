package com.learning.bits;

public class LeetCode1310_XorQueries {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] prefix = new int[arr.length];
        int[] res = new int[queries.length];
        int xor = arr[0];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            xor ^= arr[i];
            prefix[i] = xor;
        }

        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            res[i] = prefix[right];
            if (left > 0) {
                res[i] ^= prefix[left - 1];
            }
        }
        return res;
    }
}
