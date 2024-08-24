package com.learning.array;

public class LeetCode747_LargestNumberAtLeastTwice {

    public static void main(String[] args) {
        System.out.println(dominantIndex(new int[]{3, 1, 0,8, 6}));
    }

    public static int dominantIndex(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
                //if (max1 >= (2 * max2)) {
                  //  maxIndex = i;
                //}
            }
            i++;
        }
        System.out.println(max1 + " - " + max2);
        return maxIndex;
    }
}
