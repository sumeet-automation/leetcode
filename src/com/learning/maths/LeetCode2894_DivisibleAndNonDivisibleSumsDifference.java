package com.learning.maths;

public class LeetCode2894_DivisibleAndNonDivisibleSumsDifference {

    public int differenceOfSums(int n, int m) {
        //sum n*(n+1)/2
        int result=0;
        for (int i = 1; i <= n; i++) {
            if(i%m==0){
                result-=i;
            } else {
                result+=i;
            }
        }
        return result;
    }
}
