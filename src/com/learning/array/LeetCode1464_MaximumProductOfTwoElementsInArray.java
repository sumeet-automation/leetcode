package com.learning.array;

public class LeetCode1464_MaximumProductOfTwoElementsInArray {

    public int maxProduct2(int[] nums) {
        int a=0,b=0,c=0;
        for(int i:nums){
            if(i>a){
                b=a;
                a = i;
            } else if(i>b){
                b=a;
            }
        }
        return (a-1)*(b-1);
    }

    public int maxProduct(int[] nums) {
        if (nums.length == 2)
            return (nums[0] - 1) * (nums[1] - 1);
        int maxProduct = 1;
        int index1 = -1, index2 = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (maxProduct < nums[i] * nums[j]) {
                        maxProduct = nums[i] * nums[j];
                        index1 = i;
                        index2 = j;
                    }
                    System.out.println("max product " + maxProduct + "i=" + i + "j=" + j);
                }
            }
        }
        System.out.println(index1);
        System.out.println(index2);
        return (nums[index1] - 1) * (nums[index2] - 1);
    }
}
