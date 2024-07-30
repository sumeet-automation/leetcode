package com.learning.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question33_DuplicateInArray {
    public static void main(String[] args) {
        System.out.println(findDuplicateNumber(new int[]{4,3,2,7,8,2,3,1}));
    }

    public static List<Integer> findDuplicateNumber(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[Math.abs(nums[i])-1]<0)
                list.add(Math.abs(nums[i]));
            else
                nums[Math.abs(nums[i])-1]*=-1;
        }
        return list;
    }
}
