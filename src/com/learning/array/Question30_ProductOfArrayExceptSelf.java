package com.learning.array;

import java.util.Arrays;

public class Question30_ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] prefixProdut = new int[nums.length];
        int[] suffixProdut = new int[nums.length];
        int[] output = new int[nums.length];
        prefixProdut[0] = 1;
        suffixProdut[nums.length-1] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefixProdut[i]=prefixProdut[i-1]*nums[i-1];
        }
        for (int i = nums.length-2; i >=0; i--) {
            suffixProdut[i]=suffixProdut[i+1]*nums[i+1];
        }
        for (int i = 0;i<nums.length;i++) {
            output[i]=suffixProdut[i]*prefixProdut[i];
        }
        return output;
    }

    public int[] productExceptSelf1(int[] nums) {
        int[] output = new int[nums.length];
        int result = 1;
        for (int num : nums) {
            result*=num;
        }
        for (int i = 0; i < nums.length; i++) {
            output[i] = nums[i]==0 ? 0 :result / nums[i];
        }
        return output;
    }
}
