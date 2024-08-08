package com.learning.hashtable;

import java.util.HashSet;
import java.util.Set;

public class LeetCode2351_FirtLetterToAppearTwice {

    public char repeatedCharacter(String s) {
        Set<String> set = new HashSet<>();
        for (String letter : s.split("")) {
            if (set.contains(letter)) {
                return letter.charAt(0);
            }else
                set.add(letter);
        }
        return "".charAt(0);
    }
}
