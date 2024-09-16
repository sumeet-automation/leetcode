package com.learning.maths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode539_MinimumTimeDifference {

    public int findMinDifference(List<String> timePoints) {
        List<Integer> times = new ArrayList<>();
        for (String timePoint : timePoints) {
            times.add(convertToTime(timePoint));
        }
        Collections.sort(times);
        int minTime = Integer.MAX_VALUE;
        for (int i = 1; i < times.size(); i++) {
            minTime = Math.min(times.get(i) - times.get(i - 1), minTime);
        }
        return Math.min(minTime, (24 * 60) - (times.getLast() - times.getFirst()));
    }

    public int findMinDifference2(List<String> timePoints) {
        List<Integer> times = new ArrayList<>();
        for (String timePoint : timePoints) {
            times.add(convertToTime(timePoint));
        }
        Collections.sort(times);
        times.add(times.getFirst() + (24 * 60));
        int minTime = Integer.MAX_VALUE;
        for (int i = 1; i < times.size(); i++) {
            minTime = Math.min(times.get(i) - times.get(i - 1), minTime);
        }
        return minTime;
    }

    private int convertToTime(String time) {
        String[] times = time.split(":");
        return (Integer.parseInt(times[0]) * 60) + Integer.parseInt(times[1]);
    }
}
