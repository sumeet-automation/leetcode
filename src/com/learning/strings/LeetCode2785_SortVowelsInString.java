package com.learning.strings;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LeetCode2785_SortVowelsInString {

    public static void main(String[] args) {
        System.out.println(sortVowels("lEetcOde"));
    }
    public static String sortVowels(String s) {
        List<Character> list = new ArrayList<>();
        List<Character> listVowels = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        for (int i = 0; i < s.length(); i++) {
            char e = s.charAt(i);
            if (listVowels.contains(e)) {
                list.add(e);
            }
        }
        list.sort(Comparator.naturalOrder());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char e = s.charAt(i);
            if (listVowels.contains(e)) {
                sb.append(list.get(0));
                list.remove(0);
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
