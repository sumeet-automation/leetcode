package com.learning.array;

public class LeetCode1299_ReplaceElementWithNextGreaterElement {

    public int[] replaceElements(int[] arr) {
        int max=arr[arr.length-1];
        int curr=arr[arr.length-1];
        arr[arr.length-1]=-1;
        for (int i = arr.length-1; i >=0; i--) {
            curr = arr[i];
            arr[i]=max;
            max = Math.max(max, curr);
        }
        return arr;
    }
}
