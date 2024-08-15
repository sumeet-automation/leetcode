package com.learning.array;

import java.util.*;

public class LeetCode1636_SortArrayIncreasingFrequency {

    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.compute(num, (k, v) -> v == null ? 1 : v + 1);
        }
        record Bag(int item, int frequeny) {
        }
        List<Bag> list = new ArrayList<>() {
        };
        countMap.forEach((k, v) -> list.add(new Bag(k, v)));

        Collections.sort(list,
                Comparator.comparing(Bag::frequeny).thenComparing(Comparator.comparing(Bag::item).reversed()));
        int[] output = new int[nums.length];
        int index=0;
        for (int i = 0; i < list.size(); i++) {
            for (int i1 = 0; i1 < list.get(i).frequeny; i1++) {
                output[index++]=list.get(i).item;
            }
        }
        return output;
    }
}