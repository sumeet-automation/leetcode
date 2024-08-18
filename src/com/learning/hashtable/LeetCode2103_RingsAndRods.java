package com.learning.hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode2103_RingsAndRods {

    public static void main(String[] args) {
        System.out.println(countPoints("B0B6G0R6R0R6G9"));
    }
    public static int countPoints(String rings) {
        //B0B6G0R6R0R6G9
        Map<Character, Set<Character>> rodsCounter = new HashMap<>();
        for (int i = 0; i < rings.length(); i=i+2) {
            final int c = i;
            var value = rodsCounter.get(rings.charAt(i+1));
            if (value == null) {
                var set = new HashSet<Character>();
                set.add(rings.charAt(i));
                rodsCounter.put(rings.charAt(i+1),set);
            } else {
                value.add(rings.charAt(i));
                rodsCounter.put(rings.charAt(i+1),value);
            }
        }
        System.out.println(rodsCounter);
        return (int)rodsCounter.values().stream().filter(x->x.size()==3).count();
    }
}
