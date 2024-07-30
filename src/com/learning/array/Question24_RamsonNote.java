package com.learning.array;

import java.util.HashMap;
import java.util.Map;

public class Question24_RamsonNote {

    public static void main(String[] args) {
        System.out.println(canConstruct("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<String, Integer> map = new HashMap<>();
        for (String letter : ransomNote.split("")) {
            map.compute(letter, (k, v) -> v == null ? 1 : v + 1);
        }
        System.out.println(map);
        for (String letter : magazine.split("")) {
            var value = map.get(letter);
            if(value!=null)
                map.put(letter, value>0?value-1:0);
        }
        System.out.println(map);
        return map.values().stream().allMatch(x->x==0);
    }
}
