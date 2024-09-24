package com.learning.hashtable;

public class LeetCode2441 {
    public static void main(String[] args) {
        LeetCode2441 solution = new LeetCode2441();
        //System.out.println(solution.findMaxK(new int[]{-1, 1, -7, 7, 2}));
        System.out.println(solution.findMaxK(new int[]{-10, 8, 6, 7, -2, -3}));
    }

    public int findMaxK(int[] nums) {
        boolean[] hashing = new boolean[2001];
        for (int num : nums) {
            if (num > 0)
                hashing[num + 1000] = true;
            else if (num < 0)
                hashing[num * -1] = true;
        }
        for (int i = 2000; i > 1000; i--) {
            if (hashing[i] & hashing[i - 1000]) return i - 1000;
        }
        return -1;
    }

}
