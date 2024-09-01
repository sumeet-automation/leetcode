package com.learning.maths;

import java.util.Arrays;

public class LeetCode2843_CountSymmetricIntegers {

    public static void main(String[] args) {
        LeetCode2843_CountSymmetricIntegers solution = new LeetCode2843_CountSymmetricIntegers();
        System.out.println(solution.countSymmetricIntegers(1203, 1230));
    }
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for (int i = low; i <= high; i++) {
            char[] chars = String.valueOf(i).toCharArray();
            if(chars.length%2==0){
                int sum1=0,sum2=0;
                for(int j=0;j< chars.length/2;j++){
                    sum1+=chars[j]-'0';
                }
                for(int j=chars.length/2;j< chars.length;j++){
                    sum2+=chars[j]-'0';
                }
                if(sum1==sum2) count++;
            }
        }
        return count;
    }
}
