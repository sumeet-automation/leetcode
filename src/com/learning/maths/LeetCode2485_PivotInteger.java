package com.learning.maths;

public class LeetCode2485_PivotInteger {

    public int pivotInteger(int n) {
        int allSum = n * (n+1)/2;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
            allSum-=(i-1);
            if(sum==allSum) return i;
        }
        return -1;
    }

    public int pivotIntegerUsingMaths(int n) {
        int cumSum = n * (n+1)/2;
        int pivot = (int) Math.sqrt(cumSum);
        return (pivot * pivot) == cumSum ? pivot : -1;
    }
}
