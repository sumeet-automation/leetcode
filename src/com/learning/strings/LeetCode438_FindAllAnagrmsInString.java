package com.learning.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeetCode438_FindAllAnagrmsInString {

    public static void main(String[] args) {
        System.out.println(new LeetCode438_FindAllAnagrmsInString()
                .findAnagrams("aaaaaaaaaa", "aaaaaaaaaaaaa"));
    }
    public List<Integer> findAnagrams(String s, String p) {
        if(p.equals(s) ) return List.of(0);
        if(s.length()<p.length()) return Collections.EMPTY_LIST;

        int[] pFrequency = new int[26];
        for (char c : p.toCharArray()) {
           pFrequency[c-'a']++;
        }
        int[] sFrequency = new int[26];
        for (int i = 0; i < p.length()-1; i++) {
            sFrequency[s.charAt(i)-'a']++;
        }
        List<Integer> output = new ArrayList<>();
        for (int i = p.length()-1,j=0; i < s.length(); i++,j++) {
            sFrequency[s.charAt(i)-'a']++;
            if(Arrays.equals(sFrequency,pFrequency)) output.add(j);
            sFrequency[s.charAt(j)-'a']--;
        }
        return output;
    }
}
