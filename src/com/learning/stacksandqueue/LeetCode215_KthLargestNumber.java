package com.learning.stacksandqueue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LeetCode215_KthLargestNumber {

    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{1, 2, 5, 4, 6}, 2));
    }
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int num : nums) {
            queue.add(num);
        }
        int count = 1;
        System.out.println(queue);
        while (queue.iterator().hasNext()) {
            if(count==k){
                return queue.peek();
            } else {
                queue.remove();
            }
            count++;
        }
        return -1;
    }
}
