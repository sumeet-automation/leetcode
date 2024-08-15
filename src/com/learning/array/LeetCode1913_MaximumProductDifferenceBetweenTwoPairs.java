package com.learning.array;

public class LeetCode1913_MaximumProductDifferenceBetweenTwoPairs {

    public int maxProductDifference(int[] nums) {
        int max1=Integer.MIN_VALUE, max2=Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2=max1;
            }
        }

        System.out.println(max1+" --- "+max2);
        int min1=Integer.MAX_VALUE, min2=Integer.MAX_VALUE;

        for (int num : nums) {
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2=num;
            }
        }
        System.out.println(min1+" --- "+min2);
        return (max1*max2)-(min1*min2);
    }
}
