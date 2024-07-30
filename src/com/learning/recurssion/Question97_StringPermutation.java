package com.learning.recurssion;

import java.util.HashSet;
import java.util.Set;

public class Question97_StringPermutation {

    public static void main(String[] args) {
        String input = "acb";
        findPermutations(input).forEach(System.out::println);
    }

    public static Set<String> findPermutations(String input, String perm, Set<String> set) {
        if(input.isEmpty())
            set.add(perm);
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            String temp = input.substring(0, i) + input.substring(i + 1);
            findPermutations(temp,perm+ch,set);
        }
        return set;
    }

    public static Set<String> findPermutations(String input) {
        Set<String> permutationWords = new HashSet<>();
        return findPermutations(input,"",permutationWords);
    }
}
