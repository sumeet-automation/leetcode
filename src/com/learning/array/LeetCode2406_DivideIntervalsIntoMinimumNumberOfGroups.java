package com.learning.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LeetCode2406_DivideIntervalsIntoMinimumNumberOfGroups {

    public static void main(String[] args) {
    }
    //Using SLA -- SWEEP LINE ALGORITHM
    public int minGroups(int[][] intervals) {
        if (intervals.length == 1) return 1;
        int lineMin = Integer.MAX_VALUE;
        int lineMax = Integer.MIN_VALUE;
        for (int[] interval : intervals) {
            lineMin = Math.min(interval[0], lineMin);
            lineMax = Math.max(interval[1], lineMax);
        }
        int[] intervalsOverlapping = new int[lineMax + 2];
        for (int[] interval : intervals) {
            int startTime = interval[0];
            int endTime = interval[1] + 1;
            intervalsOverlapping[startTime]++;
            intervalsOverlapping[endTime]--;
        }
        int result = 0;
        int min = Integer.MAX_VALUE;
        for (int j : intervalsOverlapping) {
            result += j;
            min = Math.min(min, result);
        }
        return min;
    }

}
