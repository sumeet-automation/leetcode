package com.learning.maths;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCode2465_NumberOfDistinceAverages {

    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        Set<Double> averages = new HashSet<>();
        int left=0, right=nums.length-1;
        while(left<=right){
            double average = (double) (nums[right--]+nums[left++])/2;
            averages.add(average);
        }
        return averages.size();
    }
}
