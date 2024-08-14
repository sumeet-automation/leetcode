package com.learning.hashtable;

import java.util.HashMap;
import java.util.Map;

public class WIP_LeetCode2404_MostFrequentEvenElement {

    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            if(num%2==0)
            countMap.compute(num, (k, v) -> v == null? 1 : v + 1);
        }
        System.out.println(countMap);
        int ans = -1, max=0;
        for (var entry : countMap.entrySet()) {
            int key = entry.getKey(), value = entry.getValue();
            if (max < value) {
                max = key;
            }
        }
        return ans;
    }
}
