package com.learning.dynamicprogramming;

public class LeetCode152_MaximumProductSubArray {

    public int maxSubArray(int nums[]) {
        int maxProduct=1,  minProduct=1;
        int curr=Integer.MIN_VALUE;
        for (int num : nums) {
            if(num<0){
                int temp = minProduct;
                minProduct=maxProduct;
                maxProduct=temp;
            }
            maxProduct = Math.max(maxProduct, maxProduct * num);
            minProduct = Math.min(minProduct, minProduct * num);
            curr = Math.max(curr, maxProduct);
        }
        return curr;
    }
}
