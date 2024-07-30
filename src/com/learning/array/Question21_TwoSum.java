package com.learning.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Question21_TwoSum {

    public static void main(String[] args) {
        System.out.println(
                //Arrays.toString(twoSumIfArrayIsSorted(new int[]{2, 3, 4}, 6)));
                Arrays.toString(twoSum(new int[]{ 3,2, 4}, 6)));
    }

    public static int[] twoSumIfArrayIsSorted(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[left] + nums[right] < target) left++;
            else if (nums[left] + nums[right] > target) right--;
            else if (nums[left] + nums[right] == target) return new int[]{left + 1, right + 1};
        }
        return null;
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> differenceMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(differenceMap.get(nums[i])!=null)
                return new int[]{differenceMap.get(nums[i]),i};
            else
                differenceMap.put(target - nums[i], i);
        }
        return null;
    }
}
