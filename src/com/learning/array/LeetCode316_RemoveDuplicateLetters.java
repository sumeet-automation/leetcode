package com.learning.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode316_RemoveDuplicateLetters {

    public static void main(String[] args) {
        LeetCode316_RemoveDuplicateLetters solution = new LeetCode316_RemoveDuplicateLetters();
        System.out.println(solution.removeDuplicateLetters("cbacdcbc"));
      //  new char[]
    }
    public String removeDuplicateLetters(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char letter : s.toCharArray()) {
            freq.compute(letter, (k, v) -> v == null ? 1 : v + 1);
        }
        return "";
    }
}
