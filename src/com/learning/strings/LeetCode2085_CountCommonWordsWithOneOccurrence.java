package com.learning.strings;

import java.util.HashMap;
import java.util.Map;

public class LeetCode2085_CountCommonWordsWithOneOccurrence {

    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> words1Count = new HashMap<>();
        Map<String, Integer> words2Count = new HashMap<>();
        for (String word : words1) {
            words1Count.put(word, words1Count.getOrDefault(word, 0) + 1);
        }

        for (String word : words2) {
            words2Count.put(word, words2Count.getOrDefault(word, 0) + 1);
        }
        int count=0;
        for (Map.Entry<String, Integer> entry : words1Count.entrySet()) {
            String word = entry.getKey();
            if(entry.getValue()==1 && words2Count.getOrDefault(word,0)==1) count++;
        }
        return count;
    }
}
