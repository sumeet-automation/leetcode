package com.learning.array;

public class LeetCode2905_FindIndicesWithIndexAndValueDifferenceII {

    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int minIndex = 0;
        int maxIndex = 0;
        for(int i = indexDifference;i<nums.length;i++){
            if(nums[i-indexDifference]<nums[minIndex]){
                minIndex=i-indexDifference;
            }

            if(nums[i-indexDifference]>nums[maxIndex]){
                maxIndex=i-indexDifference;
            }

            if(Math.abs(nums[i] -nums[minIndex])>=valueDifference){
                return new int[]{i,minIndex};
            }

            if(Math.abs(nums[i] - nums[maxIndex])>=valueDifference){
                return new int[]{i,maxIndex};
            }
        }
        return new int[] { -1, -1 };
    }
}
