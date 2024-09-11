package com.learning.simulation;

public class LeetCode59_SpiralMatricII {

    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int startRow = 0;
        int endRow = n - 1;
        int startColumn = 0;
        int endColumn = n - 1;
        int value = 1;
        while (startRow <= endRow && startColumn <= endColumn) {
            //first row
            for (int j = startColumn; j <= endColumn; j++) {
                matrix[startRow][j] = value++;
            }
            startRow++;
            //end column
            for (int i = startRow; i <= endRow; i++) {
                matrix[i][endColumn] = value++;
            }
            endColumn--;
            //last row
            if (startRow <= endRow) {
                for (int j = endColumn; j >= startColumn; j--) {
                    matrix[endRow][j] = value++;
                }
                endRow--;
            }
            //first column
            if (startColumn <= endColumn) {
                for (int i = endRow; i >= startRow; i--) {
                    matrix[i][startColumn] = value++;
                }
                startColumn++;
            }
        }
        return matrix;
    }

}
