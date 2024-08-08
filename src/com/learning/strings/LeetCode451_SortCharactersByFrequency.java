package com.learning.strings;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import static java.util.stream.Collectors.joining;

public class LeetCode451_SortCharactersByFrequency {
    public String frequencySort(String s) {
        Map<String, Integer> countMap = new HashMap<>();
        for (String letter : s.split("")) {
            countMap.compute(letter, (k, v) -> v == null ? 1 : v + 1);
        }
        record Sort(String word, int frequency) { }

        return countMap.keySet().stream().map(x -> new Sort(x, countMap.get(x))).sorted(Comparator.comparing(Sort::frequency).reversed()).map(x -> x.word.repeat(x.frequency)).collect(joining(""));
    }
}
