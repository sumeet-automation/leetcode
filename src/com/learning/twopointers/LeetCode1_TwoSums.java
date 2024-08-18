package com.learning.twopointers;

import java.util.Arrays;

public class LeetCode1_TwoSums {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4}, 6)));
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
