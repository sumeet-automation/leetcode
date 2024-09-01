package com.learning.array;

import java.util.Arrays;

public class LeetCode2022_Convert1DTo2D {

    public static void main(String[] args) {
        LeetCode2022_Convert1DTo2D solution = new LeetCode2022_Convert1DTo2D();
        System.out.println(Arrays.deepToString(solution.construct2DArray(new int[]{1, 2, 3}, 1, 3)));
        System.out.println(Arrays.deepToString(solution.construct2DArray(new int[]{1, 2, 3,4}, 2, 2)));

    }
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n!=original.length) return new int[0][0];
        int[][] output = new int[m][n];
        int trace=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                output[i][j]=original[trace++];
            }
        }
        return output;
    }
}
