package com.learning.hashtable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode599_MaximumIndexSumOfTwoLists {

    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> countMap = new HashMap<>();
        Map<String, Integer> resMap = new HashMap<>();

        for (int i=0;i< list1.length;i++) {
            String restaurent = list1[i];
            countMap.put(restaurent,i);
        }
        int min = Integer.MAX_VALUE;
        for (int i=0;i< list2.length;i++) {
            String restaurent = list2[i];
            if(countMap.containsKey(restaurent)) {
                int value = Math.abs(countMap.get(restaurent) + i);
                resMap.put(restaurent, value);
                min=Math.min(min,value);
            }
        }
        final int finalMin = min;
        List<String> res =  resMap.keySet().stream().filter(x->resMap.get(x)== finalMin).toList();
        String[] output = new String[res.size()];
        for (int i = 0; i < res.size(); i++) {
            output[i] = res.get(i);
        }
        return output;
    }
}
