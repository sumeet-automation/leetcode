package com.learning.stacksandqueue;

import java.util.Stack;

public class Leecode {

    public int maxWidthRamp(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            if (stack.isEmpty() || nums[stack.peek()] > nums[i])
                stack.push(i);
        }
        int ans = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                ans = Math.max(ans, i - stack.pop());
            }
            if (stack.isEmpty()) break;
        }
        return ans;
    }
}
