package com.learning.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode442_FindAllDuplicatesInArray {

    //[4,3,2,7,2,3,1]
    //
//Constraint elements can appear max 2 and 1<nums.length
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[Math.abs(nums[i])-1]<0)
                list.add(Math.abs(nums[i]));
            else
                nums[Math.abs(nums[i])-1]*=-1;
        }
        return list;
    }

    public static void main(String[] args) {
        LeetCode442_FindAllDuplicatesInArray solution = new LeetCode442_FindAllDuplicatesInArray();
    }
}
