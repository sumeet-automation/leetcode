package com.learning.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode350_IntersectionOfTwoArrays {

    /*public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> freq1 = new HashMap<>();
        for (int num : nums1) {
            freq1.put(num, freq1.getOrDefault(num, 0) + 1);
        }
        List<Integer> res = new ArrayList<>();
        for (int num : nums2) {
            if (freq1.containsKey(num)) {
                freq1.put(num, freq1.getOrDefault(num, 0) - 1);
                res.add(num);
                if(freq1.get(num)==0) freq1.remove(num);
            }
        }
        int[] output = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            output[i] = res.get(i);
        }
        return output;
    }
*/
    
}
