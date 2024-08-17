package com.learning.array;

import java.util.stream.IntStream;

public class LeetCode2652_SumMultiples {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,10,20,5};
        int max1=Integer.MIN_VALUE, max2=Integer.MIN_VALUE;

        for (int num : nums) {
            if(num>max1){
                max2=max1;
                max1=num;
            } else if (num>max2){
                max2=num;
            }
        }
        System.out.println(max1);
        System.out.println(max2);
    }
    public int sumOfMultiples(int n) {
        return IntStream.rangeClosed(1,n)
                .filter(x->x%3==0 || x%5==0 || x%7==0)
                .sum();
    }
}
