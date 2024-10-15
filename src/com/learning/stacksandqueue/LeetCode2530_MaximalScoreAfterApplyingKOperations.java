package com.learning.stacksandqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LeetCode2530_MaximalScoreAfterApplyingKOperations {

    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> queue = new   PriorityQueue<>(Comparator.reverseOrder());
        for(var num:nums){
            queue.add(num);
        }

        //int count=0;
        long score = 0;
        while(k-- >0){
            int popElement = queue.poll();
            int element = (int)(Math.ceil(popElement/3.0));
            queue.offer(element);
            score+= popElement;
            //System.out.println(queue);
        }
        return score;
    }
}
