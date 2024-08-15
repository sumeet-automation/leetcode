package com.learning.array;

import java.util.Arrays;

public class LeetCode3194_MinimumAverageOfSmallestLargestElements {

    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double answer = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length / 2; i++) {
            answer = Math.min(answer, (double) (nums[i] + nums[nums.length - i - 1]) / 2);
        }
        return answer;
    }
}
