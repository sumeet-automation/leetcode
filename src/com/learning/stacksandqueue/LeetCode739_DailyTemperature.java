package com.learning.stacksandqueue;

import java.util.Arrays;
import java.util.Stack;

public class LeetCode739_DailyTemperature {

    public static void main(String[] args) {
        LeetCode739_DailyTemperature solution = new LeetCode739_DailyTemperature();
        System.out.println(Arrays.toString(solution.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
        System.out.println(Arrays.toString(solution.dailyTemperatures(new int[]{30, 40, 50, 60})));
        System.out.println(Arrays.toString(solution.dailyTemperatures(new int[]{60, 50, 40, 30})));
    }

    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                result[idx] = i - idx;
            }
            stack.push(i);
        }
        return result;
    }
}
