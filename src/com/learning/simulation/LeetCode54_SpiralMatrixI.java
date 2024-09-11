package com.learning.simulation;

import java.util.ArrayList;
import java.util.List;

public class LeetCode54_SpiralMatrixI {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int n = matrix.length; // rows
        int m = matrix[0].length; // columns
        int topRow = 0;
        int bottomRow = n - 1;
        int leftColumn = 0;
        int rightColumn = m - 1;

        while (topRow <= bottomRow && leftColumn <= rightColumn) {
            //first row
            for (int column = leftColumn; column <= rightColumn; column++) {
                result.add(matrix[topRow][column]);
            }
            topRow++;
            //end column
            for (int row = topRow; row <= bottomRow; row++) {
                result.add(matrix[row][rightColumn]);
            }
            rightColumn--;
            //last row
            if (topRow <= bottomRow) {
                for (int row = rightColumn; row >= leftColumn; row--) {
                    result.add(matrix[bottomRow][row]);
                }
                bottomRow--;
            }
            //first column
            if(leftColumn<=rightColumn) {
                for (int row = bottomRow; row >= topRow; row--) {
                    result.add(matrix[row][leftColumn]);
                }
                leftColumn++;
            }
        }
        return result;
    }
}
