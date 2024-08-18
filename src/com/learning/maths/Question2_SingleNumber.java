package com.learning.maths;

/*
Single Number
Given a non-empty array of integers nums, every element appears twice except one element. Find that single one.



Expected TC: O(n) and SC: O(1)



Example 1:

Input: nums = [2,2,1]

Output: 1



Example 2:

Input: nums = [4,1,2,1,2]

Output: 4



Example 3:

Input: nums = [1]

Output: 1
 */
public class Question2_SingleNumber {
    public static void main(String[] args) {
        System.out.println(findSingleNumber(new int[]{1, 1,4, 3,2,2,3}));
    }
    public static int findSingleNumber(int[] nums) {
        int output=0;
        for (int number:nums) {
            output^=number;
        }
        return output;
    }
}
