package com.learning.stacksandqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LeetCode1405_LongestHappyString {

    public String longestDiverseString(int a, int b, int c) {
        record Pair(String element, int freq) {
        }

        StringBuilder output = new StringBuilder();
        PriorityQueue<Pair> queue = new PriorityQueue<>(Comparator.comparing(Pair::freq).reversed());
        queue.offer(new Pair("a", a));
        queue.offer(new Pair("b", b));
        queue.offer(new Pair("c", c));

        int total = a + b + c;
        while (total > 0) {
            Pair ele = queue.poll();
            if (!output.toString().endsWith(ele.element.repeat(2))) {
                output.append(ele.element());
                queue.offer(new Pair(ele.element(), ele.freq() - 1));
            } else {
                Pair ele2 = queue.poll();
                if (ele2.freq() <= 0)
                    return output.toString();
                else {
                    output.append(ele2.element());
                    queue.offer(new Pair(ele2.element(), ele2.freq() - 1));
                    queue.offer(ele);
                }
            }
            total--;
        }
        return output.toString();
    }
}
