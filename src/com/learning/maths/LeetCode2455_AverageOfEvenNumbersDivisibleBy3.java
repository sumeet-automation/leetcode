package com.learning.maths;

public class LeetCode2455_AverageOfEvenNumbersDivisibleBy3 {

    public int averageValue(int[] nums) {
        int sum=0, count=0;
        for (int num : nums) {
            if(num%6==0) {sum+=num;count++;}
            ;
        }
        return count!=0?sum/count:0;
    }
}
