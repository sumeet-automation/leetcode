package com.learning.hashtable;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;

public class Leet {

    public static void main(String[] args) {
        Leet solution = new Leet();
        System.out.println(solution.removeDuplicateLetters("cbacdcbc"));
    }
    public String removeDuplicateLetters(String s) {
        var set = Collections.newSetFromMap(new LinkedHashMap<String, Boolean>(10, 0.75f, true));
        set.addAll(Arrays.asList(s.split("")));
        var output = String.join("", set);
        return output;

    }
}
