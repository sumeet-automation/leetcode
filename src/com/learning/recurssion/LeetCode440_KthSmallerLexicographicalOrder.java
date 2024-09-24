package com.learning.recurssion;

public class LeetCode440_KthSmallerLexicographicalOrder {

    public int findKthNumber(int n, int k) {
        long curr = 1;
        k--;
        while (k > 0) {
            long steps = getNumberOfSteps(n, curr);
            if (steps <= k) {
                curr++;
                k -= steps;
            } else {
                curr *= 10;
                k--;
            }
        }
        return (int) curr;
    }

    private long getNumberOfSteps(long n, long curr) {
        long steps = 0;
        long next = curr + 1;
        while (curr <= n) {
            if (next <= n) {
                steps += next - curr;
            } else {
                steps += (n - curr + 1);
            }
            curr *= 10;
            next *= 10;
        }
        return steps;
    }
}
