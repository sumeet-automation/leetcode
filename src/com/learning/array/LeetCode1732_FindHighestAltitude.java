package com.learning.array;

import java.util.Arrays;

public class LeetCode1732_FindHighestAltitude {

    public static void main(String[] args) {
        LeetCode1732_FindHighestAltitude solution = new LeetCode1732_FindHighestAltitude();
        System.out.println(solution.largestAltitude(new int[]{-5, 1, 5, 0, -7}));
    }

    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int max = 0;
        for (int num : gain) {
            altitude += num;
            max = Math.max(max, altitude);
        }
        return max;
    }

}
