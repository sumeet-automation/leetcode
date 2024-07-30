package com.learning.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Question32_DisappearingNumbers {

    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        System.out.println(findDisappearedNumbersOptimalSolution(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }

    public static List<Integer> findDisappearedNumbersOptimalSolution(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[Math.abs(nums[i]) - 1]>0) {
                nums[Math.abs(nums[i]) - 1] *= -1;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                list.add(i + 1);
        }
        return list;
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        var list = IntStream.rangeClosed(1, nums.length).boxed().collect(Collectors.toList());
        for (int num : nums) {
            if (list.contains(num)) {
                list.remove(Integer.valueOf(num));
            }
        }
        return list;
    }
}
