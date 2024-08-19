package com.learning.recurssion;

import java.util.HashSet;
import java.util.Set;

public class Question97_StringPermutation {
    public static void main(String[] args) {
        String input = "123";
        findPermutations(input, "",new HashSet<>()).forEach(System.out::println);
    }

    public static Set<String> findPermutations(String input, String perm, Set<String> ans) {
        //if(perm.length()==length)
        ans.add(perm);
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            String temp = input.substring(0, i) + input.substring(i + 1);
            findPermutations(temp, perm + ch, ans);
        }
        return ans;
    }
}
