package com.learning.array;

import java.util.Arrays;

public class LeetCode1051_HeightChecker {

    public int heightChecker(int[] heights) {
        //int [] heightCopy = Arrays.copyOf(heights, heights.length);
        int[] heightCopy = heights.clone();
        Arrays.sort(heightCopy);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights != heightCopy) {
                count++;
            }
        }
        return count;
    }

    public int heightCheckerUsingCountSort(int[] heights) {
//int [] heightCopy = Arrays.copyOf(heights, heights.length);
        //Arrays.sort(heightCopy);
        //implementing count sort
        int[] heightCopy = new int[heights.length];
        int maxHeight = 101;
        int[] heightCount = new int[maxHeight]; //100 because of constraints
        for (int i = 0; i < heights.length; i++) {
            heightCount[heights[i]]++;
        }

        for (int j = 0, idx = 0; j < heightCount.length; j++) {
            int height = heightCount[j];
            if (height != 0) {
                for (int i = 0; i < height; i++) {
                    heightCopy[idx++] = j;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != heightCopy[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        LeetCode1051_HeightChecker solution = new LeetCode1051_HeightChecker();
        solution.heightCheckerUsingCountSort(new int[]{1, 1, 4, 2, 1, 3});
    }
}
