package com.learning.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class LeetCode387_FirstUniqueCharacter {

    public int firstUniqChar(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        IntStream.range(0, s.length()).forEach(x -> countMap.compute(s.charAt(x), (k, v) -> v == null ? 1 : v + 1));

        for (int i = 0; i < s.length(); i++) {
            if (countMap.get(s.charAt(i)) > 1)
                return i;
        }
        return -1;
    }
}
