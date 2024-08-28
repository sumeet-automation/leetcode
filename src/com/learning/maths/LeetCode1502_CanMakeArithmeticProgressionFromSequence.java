package com.learning.maths;

import java.util.Arrays;

public class LeetCode1502_CanMakeArithmeticProgressionFromSequence {

    public static void main(String[] args) {
        System.out.println(canMakeArithmeticProgression(new int[]{3, 5, 1}));
    }
    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int difference = arr[1]-arr[0];
        System.out.println(Arrays.toString(arr));
        System.out.println(difference);
        for (int i = 2; i < arr.length; i++) {
            if(arr[i]-arr[i-1]!= difference) return false;
        }
        return true;
    }
}
