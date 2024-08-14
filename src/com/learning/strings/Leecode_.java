package com.learning.strings;

import java.util.Map;
import java.util.TreeMap;

public class Leecode_ {

    //aaaabbbbcccc

    public String sortString(String s) {
        TreeMap<String, Integer> countMap = new TreeMap<>();
        for (String letter : s.split("")) {
            countMap.compute(letter, (k, v) -> v == null ? 1 : v + 1);
        }

        String output = "";
        for (int i = 0; i < s.length(); ) {
            for (Map.Entry<String, Integer> stringIntegerEntry : countMap.entrySet()) {
                i++;
                output += stringIntegerEntry.getKey();
                int value = stringIntegerEntry.getValue();
                if (value > 0) {
                    countMap.put(stringIntegerEntry.getKey(), stringIntegerEntry.getValue() - 1);
                } else {
                    countMap.remove(stringIntegerEntry.getKey());
                }
            }
            for (String stringIntegerEntry : countMap.descendingKeySet()) {
                i++;
                output += stringIntegerEntry;
                int value = countMap.get(stringIntegerEntry);
                if (value > 0) {
                    countMap.put(stringIntegerEntry, countMap.get(stringIntegerEntry) - 1);
                } else {
                    countMap.remove(stringIntegerEntry);
                }
            }
        }
        System.out.println(output);
        return output;
    }
}
