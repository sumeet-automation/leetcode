package com.learning.twopointers;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1089_DulicateZeroes {

    public static void main(String[] args) {
        duplicateZeros(new int[]{1, 2, 0, 2, 5, 0, 4});
    }
    public static void duplicateZeros(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                list.add(arr[i+1]);
        //        arr[i + 1] = 0;
            }
        }
        System.out.println(list);
    }
}
