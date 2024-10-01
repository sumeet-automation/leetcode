package com.learning.fav;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOfStrings {

    public static void main(String[] args) {
        findPerm("abcd");
        findComb("aavcc");
    }

    public static void findComb(String input) {
        List<String> list = new ArrayList<>();
        combine(input, "", list);
        System.out.println(list);
    }
    public static void findPerm(String input) {
        List<String> list = new ArrayList<>();
        perm(input, "", list);
        System.out.println(list);
    }

    private static void perm(String input, String perm, List<String> list) {
        if(isPalindromic(perm))
        list.add(perm);
        for (int i = 0; i < input.length(); i++) {
            String temp = input.substring(0, i) + input.substring(i + 1);
            perm(temp, perm + input.charAt(i), list);
        }
    }

    private static void combine(String input, String perm, List<String> list) {
        if(isPalindromic(perm))
            list.add(perm);
        for (int i = 0; i < input.length(); i++) {
            String temp =  input.substring(0, i)+input.substring(i + 1);
            combine(temp, perm + input.charAt(i), list);
        }
    }

    private static boolean isPalindromic(String perm) {
        return new StringBuilder(perm).reverse().toString().equals(perm);
    }
}
