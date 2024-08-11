package com.learning.array;

import java.util.*;

public class LeetCode2053_KthDistinctStringInArray {

    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> countMap = new LinkedHashMap<>();
        for (String word : arr) {
            countMap.compute(word, (ignore, v) -> v == null ? 1 : v + 1);
        }
        Iterator<Map.Entry<String, Integer>> iterator = countMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() != 1) { // Remove even values
                iterator.remove();
            }
        }
        System.out.println(countMap);
        int i=1;
        for (var entry:countMap.entrySet()) {
            if(i==k)
                return entry.getKey();
            i++;
        }
        return "";
    }
}
