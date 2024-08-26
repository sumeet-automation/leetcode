package com.learning.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class LeetCode821_ShortestDistanceToACharacter {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shortestToChar("loveleetcode", 'e')));
    }
    public static int[] shortestToChar(String s, char c) {
        List<Integer> stack = new ArrayList<>();
        stack.add(-10000);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                stack.add(i);
            }
        }
        int[] result = new int[s.length()];
        stack.add(Integer.MAX_VALUE);
        int first = stack.getFirst();
        int second = stack.get(1);
        int k=2;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != c) {
                result[i]=Math.min(i-first,second-i);
            } else {
                first=second;
                second = stack.get(k);
                k++;
            }
        }
        return result;
    }
}
