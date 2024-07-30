package com.learning.strings;

import java.util.*;

public class Question12_DnaRepeat {

    public static void main(String[] args) {
        String dna = "AAAAAAAAAAAA";
        System.out.println(findRepeatedDnaSequence(dna));
    }

    private static List<String> findRepeatedDnaSequence(String s) {
        Set<String> list = new HashSet<>();
        for (int i = 0; i < s.length() - 10; i++) {
            if(s.substring(i+1).contains(s.substring(i,i+10)))
                    list.add(s.substring(i,i+10));
        }
        return new ArrayList<>(list);
    }
}
