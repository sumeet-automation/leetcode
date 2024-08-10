package com.learning.array;

import java.util.Arrays;

public class LeetCode2574_LeftRightSumDifference {

    public int[] leftRightDifference(int[] nums) {
        int leftSum=0,rightSum=Arrays.stream(nums).sum();
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            answer[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        }
        return answer;
    }
}
