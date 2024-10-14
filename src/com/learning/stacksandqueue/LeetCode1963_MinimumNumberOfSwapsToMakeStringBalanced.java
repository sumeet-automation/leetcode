package com.learning.stacksandqueue;

import java.util.*;

public class LeetCode1963_MinimumNumberOfSwapsToMakeStringBalanced {

    public static void main(String[] args) {
        LeetCode1963_MinimumNumberOfSwapsToMakeStringBalanced solution = new LeetCode1963_MinimumNumberOfSwapsToMakeStringBalanced();
        System.out.println(solution.minSwaps("]]][[["));
        System.out.println(solution.minSwapsWithoutStack("]]][[["));
    }

    public int minSwaps(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!stack.empty() && stack.peek() == '[' && ch == ']') {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return ((stack.size() / 2) + 1) / 2;
    }

    public int minSwapsWithoutStack(String s) {
        int openBrackets = 0, closeBrackets = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '[') {
                openBrackets++;
            } else {
                if (openBrackets <= 0)
                    closeBrackets++;
                else openBrackets--;
            }
        }
        return ((closeBrackets) + 1) / 2;
    }

    public int[] topKFrequent(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        int[] result = new int[k];
        for (int i : set) {
            queue.add(i);
            k--;
            if (k <= 0) break;
        }

        int i = 0;
        for (int num : queue) {
            result[i++] = num;
        }
        return result;
    }
}
