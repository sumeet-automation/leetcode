package com.learning.array;

public class Question34_FirstPositiveNumber {

    public static void main(String[] args) {
        System.out.println(firstPositiveNumber(new int[]{1,2,0}));
    }

    public static int firstPositiveNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) {
                nums[i] = nums.length + 1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (index < nums.length ) {
                nums[index] = Math.abs(nums[index])*-1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }
}
