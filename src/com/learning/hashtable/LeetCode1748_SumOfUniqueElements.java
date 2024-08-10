package com.learning.hashtable;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1748_SumOfUniqueElements {

    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.compute(num, (k, v) -> v == null ? 1 : v + 1);
        }
        int sum=0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                sum+= entry.getKey();
            }
        }
        return sum;
    }
}
