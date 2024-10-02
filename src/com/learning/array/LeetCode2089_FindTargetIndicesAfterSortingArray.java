package com.learning.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode2089_FindTargetIndicesAfterSortingArray {

    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target)
                result.add(i);
        }
        return result;
    }

    public List<Integer> targetIndicesWithougSort(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        int lowerElementCount = 0;
        int targetElementCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<target) lowerElementCount++;
            if(nums[i]==target) targetElementCount++;
        }
        for (int i = lowerElementCount; i < targetElementCount+lowerElementCount; i++) {
            result.add(i);
        }
        return result;
    }
}
