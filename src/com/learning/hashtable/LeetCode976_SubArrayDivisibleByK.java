package com.learning.hashtable;

import java.util.HashMap;
import java.util.Map;

public class LeetCode976_SubArrayDivisibleByK {

    public static void main(String[] args) {
        LeetCode976_SubArrayDivisibleByK solution = new LeetCode976_SubArrayDivisibleByK();
        solution.subarraysDivByK(new int[]{4, 5, 0, -2, -3, 1}, 5);
    }
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0, 1);
        int sum=0;
        int count=0;
        for(int num:nums){
            sum+=num;
            int rem = sum%k;
            rem=rem<0?rem+k:rem;
            if(prefixSum.containsKey(rem)){
                count += prefixSum.get(rem);
            }
            prefixSum.compute(rem,(key,v)->v==null?1:v+1);
        }
        return count;
    }
}
