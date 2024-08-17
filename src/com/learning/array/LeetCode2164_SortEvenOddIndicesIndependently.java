package com.learning.array;

import java.util.Arrays;
import java.util.Comparator;

public class LeetCode2164_SortEvenOddIndicesIndependently {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortEvenOdd(new int[]{4,1,2,3,7,8,9})));
    }
    public static int[] sortEvenOdd(int[] nums) {
        //1 2 3 4 5
        int[] a = new int[(nums.length/2)+1];
        int[] b = new int[(nums.length/2)+1];

        for (int i = 0, idx1=0; i < nums.length; i=i+2,idx1++) {
            a[idx1] = nums[i];
        }
        System.out.println(Arrays.toString(a));
        for (int i = 1, inx1=0; i < nums.length; i+=i+1,++inx1) {
            System.out.println("here "+i);
            b[inx1] = nums[i];
        }
        System.out.println(Arrays.toString(b));
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        int[] ans = new int[nums.length];
        for (int i = 1, idx1=a.length; i < nums.length; i=i+2,idx1--) {
            ans[i] = nums[idx1];
        }
        for (int i = 0, idx1=b.length; i < nums.length; i=i+2,idx1--) {
            ans[i] = nums[idx1];
        }
        return ans;
    }
}
