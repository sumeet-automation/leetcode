package com.learning.array;

public class LeetCode485_MaxConsucutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int maxLength = 1;

        int currentLength = 1;
        boolean any = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 1 && nums[i + 1] == 1) {
                any = true;
                currentLength++;
                maxLength = Math.max(currentLength, maxLength);
            } else {
                currentLength = 1;
            }
        }
        return any ? maxLength : 0;
    }
}
