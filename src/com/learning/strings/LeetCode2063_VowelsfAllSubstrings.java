package com.learning.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode2063_VowelsfAllSubstrings {

    public static void main(String[] args) {
        countVowels("aba");
    }
    public static long countVowels(String word) {
        System.out.println(perm(word, "", new HashSet<>()));
        return 0;
    }

    public static Set<String> perm(String input, String perm, Set<String> ans) {
        if(perm.contains("a" ) && perm.contains("e" ) || perm.contains("i" )  || perm.contains("o" ) || perm.contains("u" ) )
        ans.add(perm);
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            String temp = input.substring(0, i) + input.substring(i + 1);
            perm(temp, perm + ch, ans);
        }
        return ans;
    }
}
