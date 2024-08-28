package com.learning.strings;

import java.util.HashMap;
import java.util.Map;

public class LeetCode205_IsomorphicStrings {

    public static void main(String[] args) {
        LeetCode205_IsomorphicStrings solution = new LeetCode205_IsomorphicStrings();
        System.out.println(solution.isIsomorphic("badc", "baba"));
    }
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            if(map.containsKey(key) ){
                if(map.get(key)!=t.charAt(i)) return false;
            } else {
                if(map.containsValue(t.charAt(i))) return false;
                else map.put(key, t.charAt(i));
            }
        }
        return true;
    }
}
