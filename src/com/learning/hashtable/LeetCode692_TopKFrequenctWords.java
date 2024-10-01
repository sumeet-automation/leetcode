package com.learning.hashtable;

import java.util.*;

public class LeetCode692_TopKFrequenctWords {

    public static void main(String[] args) {
        LeetCode692_TopKFrequenctWords solution = new LeetCode692_TopKFrequenctWords();
        System.out.println(solution.topKFrequent(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2));
    }
    public List<String> topKFrequent(String[] words, int k) {
        List<String> result = new ArrayList<>();
        Map<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            freq.compute(word, (key, v) -> v == null ? 1 : v + 1);
        }
        record Freq(String word, int freq){}
        Queue<Freq> priorityQueue = new PriorityQueue<>(Comparator.comparing(Freq::freq).reversed().thenComparing(Freq::word));
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            priorityQueue.offer(new Freq(entry.getKey(), entry.getValue()));
        }
        while (!priorityQueue.isEmpty() && result.size()<k){
            result.add(priorityQueue.poll().word);
        }
        return result;
    }
}
