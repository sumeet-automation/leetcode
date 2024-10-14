package com.learning.array;

import java.util.Arrays;
import java.util.Comparator;

public class Lee {

    public static void main(String[] args) {
        Lee solution = new Lee();
        solution.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}});
    }

    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int end = intervals[0][1];
        int result = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < end) {
                result++;
            } else {
                end = intervals[i][1];
            }
        }
        return result;
    }
}