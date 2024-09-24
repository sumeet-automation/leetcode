package com.learning.stacksandqueue;

import java.util.Arrays;
import java.util.Stack;

public class LeetCode503_NextGreaterElementII {

    public static void main(String[] args) {
        LeetCode503_NextGreaterElementII solution = new LeetCode503_NextGreaterElementII();
        System.out.println(Arrays.toString(solution.nextGreaterElement(new int[]{2, 4, 7, 9, 1, 20, 9})));
        System.out.println(Arrays.toString(solution.nextGreaterElementCircular(new int[]{2, 4, 7, 9, 1, 20, 9})));
    }

    public int[] nextGreaterElementCircular(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i % n]) {
                stack.pop();
            }
            if (i < n) {
                if (stack.isEmpty()) {
                    res[i] = -1;
                }
                else {
                    res[i] = stack.peek();
                }
            }
            stack.push(nums[i % n]);
        }
        return res;
    }

    public int[] nextGreaterElement(int[] nums) {
        int length = nums.length;
        int[] res = new int[length];
        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }
            stack.push(nums[i]);
        }
        return res;
    }
}
