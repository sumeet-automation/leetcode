package com.learning.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1089_DulicateZeroes {

    public static void main(String[] args) {
        duplicateZeros(new int[]{1,0,2,3,0,4,5,0});
    }
    public static void duplicateZeros(int[] arr) {
        long zeroes = Arrays.stream(arr).filter(x->x==0).count();
        int output[] = new int[(int) (zeroes + arr.length)];
        int curr = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                output[curr] = arr[i];
            } else {
                curr++;
            }
            curr++;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
