package com.learning.stacksandqueue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LeetCode496_NextGreaterElement1 {

    public int[] nextGreaterElementUsingBrueForce(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Arrays.fill(res, -1);
        for (int i = 0; i < nums1.length; i++) {
            boolean found = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    found=true;
                }
                if (found&& nums2[j]>nums1[i]) {
                        res[i] = nums2[j];
                        break;
                    }
                }
            }
        return res;
    }

    public int[] nextGreaterElementUsingMap(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Arrays.fill(res, -1);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }
        for (int i = 0; i < nums1.length; i++) {
            for (int j = map.get(nums1[i])+1; j < nums2.length; j++) {
                if (nums2[j]>nums1[i]) {
                    res[i] = nums2[j];
                    break;
                }
            }
        }
        return res;
    }

    public int[] nextGreaterElementUsingStack(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nums2.length; i++) {
        while (!stack.isEmpty() && stack.peek()<nums2[i]){
            map.put(stack.pop(), nums2[i]);
        }
        stack.push(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.getOrDefault(nums1[i], -1);
        }
        return res;
    }
}
