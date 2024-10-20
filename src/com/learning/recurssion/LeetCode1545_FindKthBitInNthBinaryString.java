package com.learning.recurssion;

import com.sun.jdi.connect.spi.TransportService;

import java.util.List;

public class LeetCode1545_FindKthBitInNthBinaryString {

    public char findKthBit(int n, int k) {
        int len = (1<<n)-1;
        return recur(len,k);
    }

    private char recur(int len, int k) {
        if (len == 1) {
            return '0';
        }

        int half = len / 2;
        int middle = half + 1;
        if (k == middle) return '1';
        else if (k < middle) {
            return recur(half, k);
        } else { //right
            char ans = recur(half, 1 + (len - k));
            return ans == '0' ? '1' : '0';
        }

    }
}
