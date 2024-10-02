package com.learning.hashtable;

import java.util.HashSet;
import java.util.Set;

public class LeetCode720_LongestWordInDictionary {

    public class Trie{
        boolean isWordEnd;

    }
    public String longestWord(String[] words) {
        String result = "";
        Set<String> wordSet = new HashSet<>();
        for (String word : words) {
            wordSet.add(word);
        }

        return result;
    }
}
