package com.learning.array;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class LeetCode1331_RankTransformOfArray {

    public static void main(String[] args) {
        LeetCode1331_RankTransformOfArray solution = new LeetCode1331_RankTransformOfArray();
        System.out.println(Arrays.toString(solution.arrayRankTransform(new int[]{37,12,28,9,100,56,80,5,12})));
    }
    public int[] arrayRankTransform(int[] arr) {
        int length = arr.length;
        int[] res = new int[length];
        Map<Integer, Integer> rankHolder = new TreeMap<>();
        for (int num : arr) {
            rankHolder.put(num, 0);
        }
        int rank=1;
        for (Map.Entry<Integer, Integer> entry : rankHolder.entrySet()) {
            rankHolder.put(entry.getKey(), rank++);
        }
        for (int i = 0; i < arr.length; i++) {
            res[i] = rankHolder.get(arr[i]);
        }
        return res;
    }
}
