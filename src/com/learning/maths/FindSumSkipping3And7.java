package com.learning.maths;
public class FindSumSkipping3And7 {
    private static int findSum(int[] arr, int num1, int num2) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num == num1)
                while (arr[i] != num2 && i < arr.length - 1) i++;
            else
                sum += num;
        }
        return sum;
    }
}