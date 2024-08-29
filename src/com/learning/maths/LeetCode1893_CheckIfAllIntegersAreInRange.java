package com.learning.maths;

public class LeetCode1893_CheckIfAllIntegersAreInRange {

    public boolean isCovered(int[][] ranges, int left, int right) {
        for (int i = left; i <= right; i++) {
            boolean checking = false;
            for (int j = 0; j < ranges.length; j++) {
                if (ranges[j][0] <= i && ranges[j][1] >= i) {
                    checking = true;
                    break;
                }
            }
            if (!checking) return false;
        }
        return true;
    }
}
