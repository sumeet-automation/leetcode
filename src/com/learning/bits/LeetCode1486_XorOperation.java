package com.learning.bits;

public class LeetCode1486_XorOperation {

    public int xorOperation(int n, int start) {
        int xor = start;
        int count;
        for (count = 0, start = start + 2; count < n - 1; start = start + 2, count++) {
            xor ^= start;
        }
        return xor;
    }
}
