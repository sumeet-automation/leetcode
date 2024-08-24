package com.learning.array;

import java.util.Arrays;

public class LeetCode1013_PartitionArrayIntoThreeParts {

    public static void main(String[] args) {
        System.out.println(canThreePartsEqualSum(new int[]{1,-1,1,-1}));
    }

    public static boolean canThreePartsEqualSum(int[] arr) {
        int sumToFind = Arrays.stream(arr).sum() / 3;
        int index1 = -1, index2 = -1, index3 = -1;
        int tempSum1 = 0, tempSum2 = 0, tempSum3 = 0;
        for (int i = 0; i < arr.length; i++) {
            tempSum1 += arr[i];
            if (tempSum1 == sumToFind) {
                index1 = i;
                break;
            }
        }
        if (index1 == -1) return false;
        for (int i = index1+1; i < arr.length; i++) {
            tempSum2 += arr[i];
            if (tempSum2 == sumToFind) {
                index2 = i;
                break;
            }
        }
        System.out.println(index2);
        if (index2 == -1 || (index2+1)==arr.length) return false;

        for (int i = index2+1; i < arr.length; i++) {
            tempSum3 += arr[i];
        }
        System.out.println(index3);
        if (tempSum3!=sumToFind) return false;
        return true;
    }
}
