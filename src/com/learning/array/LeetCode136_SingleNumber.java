package com.learning.array;

import java.util.HashSet;
import java.util.Set;

public class LeetCode136_SingleNumber {

    public static void main(String[] args) {
        System.out.println(new LeetCode136_SingleNumber()
                .singleNumber(new int[]{4, 1, 2, 1, 2}));
    }
    public int singleNumber(int[] nums) {
        //2,2,1
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if(set.contains(num))
                return num;
            else
                set.add(num);
        }
        return -1;
    }
}
