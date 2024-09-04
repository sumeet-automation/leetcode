package com.learning.recurssion;

import java.util.ArrayList;
import java.util.List;

public class LeetCode784_LetterCasePermutation {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //new LeetCode784_LetterCasePermutation().permCase("a1b23", "", list);
        new LeetCode784_LetterCasePermutation().findPerm("a1b23");
        for (String s : list) {
            System.out.println(s);
        }
    }

    /*private void findPerm(String input, String per, List<String> list) {
        if (input.isEmpty()) {
            list.add(per);
            return;
        }

        char currentChar = input.charAt(0);

        if (Character.isDigit(currentChar)) {
            permCase(input.substring(1), per + currentChar, list);
        } else {
            permCase(input.substring(1), per + Character.toLowerCase(currentChar), list);
            permCase(input.substring(1), per + Character.toUpperCase(currentChar), list);
        }
    }*/

    public void findPerm(String input) {
        List<String> list = new ArrayList<>();
        perm(input, "", list);
        list.stream().forEach(System.out::println);
    }

    private void perm(String input, String per, List<String> list) {
        if (per.length()==5) {
            list.add(per);
        }
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (Character.isDigit(currentChar)) {
                // Directly append the digit and recurse
                perm(input.substring(1), per + currentChar, list);
            } else {
                // Recurse for both lowercase and uppercase characters
                perm(input.substring(1), per + Character.toLowerCase(currentChar), list);
                perm(input.substring(1), per + Character.toUpperCase(currentChar), list);
            }
        }
    }
}
