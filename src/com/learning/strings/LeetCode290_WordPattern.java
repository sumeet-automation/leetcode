package com.learning.strings;

import java.util.HashMap;
import java.util.Map;

public class LeetCode290_WordPattern {

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog dog dog dog"));
    }

    public static boolean wordPattern(String pattern, String s) {
        //String[] patternsSplit = pattern.split("");
        String[] sSplit = s.split(" ");
        if(sSplit.length!=pattern.length()) return false;
        Map<String, String> map = new HashMap<>();

        for (int i=0;i<pattern.length();i++) {
            String letter = String.valueOf(pattern.charAt(i));
            if (map.containsKey(letter)) {
                if (!map.get(letter).equals(sSplit[i])) {
                    return false;
                }
            } else {
                if(map.values().contains(sSplit[i]))return false;
                map.put(letter, sSplit[i]);
            }

        }
return true;
    }
}
