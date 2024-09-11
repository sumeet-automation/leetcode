package com.learning.array;

import java.util.*;

public class LeetCode2133CheckIfAllRowAndColumnContainAllNumbers {

    public static void main(String[] args) {
        LeetCode2133CheckIfAllRowAndColumnContainAllNumbers solution = new LeetCode2133CheckIfAllRowAndColumnContainAllNumbers();
        //System.out.println(solution.checkValid(new int[][]{{1, 2, 3}, {1, 2, 3}, {2, 3, 1}}));
    }
    public boolean checkValid(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        Set<Integer> numbers = new HashSet<>();
        for (int j = 1; j <= rows; j++) {
            numbers.add(j);
        }
        for (int i = 0; i < rows; i++) {
            var numbersCopy = new HashSet<>(numbers);
            System.out.println(Arrays.toString(matrix[i]));
            for (int j = 0; j < columns; j++) {
                numbersCopy.remove(matrix[i][j]);
            }
            if (!numbersCopy.isEmpty()) return false;
        }

        for (int i = 0; i < rows; i++) {
            var numbersCopy = new HashSet<>(numbers);
            System.out.println(Arrays.toString(matrix[i]));
            for (int j = 0; j < columns; j++) {
                numbersCopy.remove(matrix[j][i]);
            }
            if (!numbersCopy.isEmpty()) return false;
        }
        return true;
    }
}
