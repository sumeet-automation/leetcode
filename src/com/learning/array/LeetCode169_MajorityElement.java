package com.learning.array;

import java.util.HashMap;
import java.util.Map;

public class LeetCode169_MajorityElement {

    public static int majorityElementUsingMooreVoting(int[] nums) {
        int candidate = 0, counter = 0;
        for (int num : nums) {
            if (counter == 0) {
                candidate = num;
                counter=1;
            } else {
                if (candidate == num) {
                    counter++;
                } else counter--;
            }
        }
        return candidate;
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.compute(num, (k, v) -> v == null ? 1 : v + 1);
        }
        int output = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int key = entry.getKey(), value = entry.getValue();
            if (value > nums.length / 2) {
                return key;
            }
        }
        return output;
    }
}
