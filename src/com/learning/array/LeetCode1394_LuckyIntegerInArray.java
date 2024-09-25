package com.learning.array;

public class LeetCode1394_LuckyIntegerInArray {

    public int findLucky(int[] arr) {
        int[] countSort = new int[501];
        for (int num : arr) {
            countSort[num]++;
        }
        int output = -1;
        for (int i = 1; i < 501; i++) {
            if(countSort[i]==i) {
                output= i;
            }
        }
        return output;
    }
}
