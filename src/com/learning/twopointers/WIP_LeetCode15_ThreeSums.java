package com.learning.twopointers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WIP_LeetCode15_ThreeSums {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4}, 6)));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if(set.contains(num))
                break;
            else {
                set.add(num);
                //twoSum()
            }
        }
        return null;
    }
    public static int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right = numbers.length-1;
        while (left < right) {
            if(numbers[left]+numbers[right]==target)
                return new int[]{left,right};
            else if(numbers[left]+numbers[right]<target)
                left++;
            else if(numbers[left]+numbers[right]>target)
                right--;
        }
        return new int[]{};
    }

}
