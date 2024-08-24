package com.learning.array;

public class LeetCode2529_MaxCountOfPosAndNeg {
    public int maximumCount(int[] nums) {
        int pos=0, neg=0;
        for (var num : nums) {
            if(num>0) pos++;
            if (num<0) neg++;
        }
        return Math.max(pos,neg);
    }
}
