package com.learning.strings;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question13_ValidAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("aa", "bb"));
        System.out.println(isAnagram("crr", "rac"));
        System.out.println(isAnagram("car", "rac"));
        System.out.println(isAnagramUsingArray("aa", "bb"));
        System.out.println(isAnagramUsingArray("crr", "rac"));
        System.out.println(isAnagramUsingArray("car", "rac"));
    }

    public static boolean isAnagramUsingArray(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] charArray = new char[26];
        for (int i = 0; i < s.length(); i++) {
            charArray[(int) s.charAt(i)-'a']++;
            charArray[(int) t.charAt(i)-'a']--;
        }
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i]!=0)return false;
        }
        return true;
    }
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        return countLetters(s).equals(countLetters(t));
    }

    private static Map<String, Long> countLetters(String s) {
        //Map<String, Integer> map = new HashMap<>();
        return Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //return null;
    }
}
