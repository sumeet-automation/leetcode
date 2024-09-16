package com.learning.array;

import java.util.PriorityQueue;

public class LeetCode905_SortArrayByParity {

    public static void main(String[] args) {
        PriorityQueue<Integer> odds = new PriorityQueue<>();
        PriorityQueue<Integer> evens = new PriorityQueue<>();
        /*for (String s : "1452364".split("")) {

        }*/
        odds.add(1);
        odds.add(9);
        odds.add(4);
        odds.add(7);
        evens.add(8);
        evens.add(4);
        evens.add(9);
        System.out.println(odds);
        System.out.println(evens);
    }
    public int[] sortArrayByParity(int[] nums) {
        int idx=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0){
                int temp=nums[i];
                nums[i]=nums[idx];
                nums[idx]=temp;
                idx++;
            }
        }
        return nums;
    }
}
