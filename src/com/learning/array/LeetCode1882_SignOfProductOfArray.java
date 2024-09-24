package com.learning.array;

public class LeetCode1882_SignOfProductOfArray {

    public int arraySign(int[] nums) {
        int result = 1;
        for (int num : nums) {
            if(num==0) return 0;
            else if (num<0) result*=-1;
        }
        return result;
    }
}
