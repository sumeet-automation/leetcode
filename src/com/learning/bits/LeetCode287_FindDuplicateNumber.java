package com.learning.bits;

import java.util.Arrays;

public class LeetCode287_FindDuplicateNumber {

    public static void main(String[] args) {
        System.out.println(5&3);
    }
    public static int hammingWeight(int n) {
        int count=0;
        while (n >= 1) {
            if (n % 2 != 0) {
                count++;
            }
            n/=2;
        }
        return count;
    }
}
