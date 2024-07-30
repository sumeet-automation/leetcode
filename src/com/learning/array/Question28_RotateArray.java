package com.learning.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question28_RotateArray {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2  };
        rotateOptimize(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
    public static void rotateOptimize(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = Math.abs(nums.length - (k % nums.length)); i < nums.length; i++) {
            list.add(nums[i]);
        }
        for (int i = 0; i < nums.length - (k % nums.length); i++) {
            list.add(nums[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
    }

    public static void rotate(int[] nums, int k) {
        for (int j = 0; j < k % nums.length; j++) {
            for (int i = 0; i < nums.length - 1; i++) {
                int temp = nums[0];
                nums[0] = nums[i + 1];
                nums[i + 1] = temp;
            }
        }
        //nums[0] = temp;
    }
}
