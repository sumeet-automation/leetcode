package com.learning.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode27_RemoveElement {

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{2, 3, 3, 4}, 3));
    }
    public static int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>();
        //2,3,3,4
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=val)
                list.add(i);
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = nums[list.get(i)];
        }
        return list.size();
    }
}
