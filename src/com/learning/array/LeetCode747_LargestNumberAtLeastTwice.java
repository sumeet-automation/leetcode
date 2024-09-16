package com.learning.array;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode747_LargestNumberAtLeastTwice {

    public static void main(String[] args) {
     System.out.println(dominantIndex(new int[]{1,0}));
    }


    public static int dominantIndex(int[] nums) {
        int max1 = nums[0];
        int maxIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>=max1){
                max1 = nums[i];
                maxIndex=i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(i!=maxIndex){
                if(2*nums[i]>(max1)){
                    return -1;
                }
            }
        }
        return maxIndex;
    }

}
