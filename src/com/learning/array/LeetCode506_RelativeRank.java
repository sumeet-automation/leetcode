package com.learning.array;

import java.util.Arrays;

public class LeetCode506_RelativeRank {

    public static void main(String[] args) {
        LeetCode506_RelativeRank solution = new LeetCode506_RelativeRank();
        System.out.println(Arrays.toString(solution.findRelativeRanks(new int[]{10, 3, 8, 9, 4})));
    }

    public String[] findRelativeRanks(int[] score) {
        int max = findMax(score);
        int[] sort = new int[max + 1];
        int n = score.length;
        for (int i = 0; i < n; i++) {
            sort[score[i]] = i + 1;
        }
        String[] output = new String[n];
        int rank = 1;
        for (int i = max; i >= 0; i--) {
            if (sort[i] != 0) {
                int originalIndex = sort[i] - 1;
                if (rank == 1) {
                    output[originalIndex] = "Gold Medal";
                } else if (rank == 2) {
                    output[originalIndex] = "Silver Medal";
                } else if (rank == 3) {
                    output[originalIndex] = "Bronze Medal";
                } else {
                    output[originalIndex] = Integer.toString(rank);
                }
                rank++;
            }
            if (rank > n) break;
        }
        return output;
    }

    private int findMax(int[] score) {
        int max = Integer.MIN_VALUE;
        for (int num : score) {
            max = Math.max(num, max);
        }
        return max;
    }
}
