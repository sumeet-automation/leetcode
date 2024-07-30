package com.learning.array;

import java.util.Arrays;

public class LeetCode66_PlusOne {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new LeetCode66_PlusOne().plusOne(new int[]{ 9})));
    }
    public int[] plusOne(int[] digits) {
        boolean carryForword = false;
        //{234}+1
        int i;
        for (i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + 1;
            if (sum < 10) {
                if(carryForword){
                    digits[i] =digits[i]+1;
                    return digits;
                } else {
                    digits[i] = sum;
                    return digits;
                }
            } else {
                digits[i] = 0;
                carryForword = true;
            }
        }
        if(i==-1){
            int[] output = new int[digits.length+1];
            output[0]=1;
            return output;
        }
        return digits;
    }
}
