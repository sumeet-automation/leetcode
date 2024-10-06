package com.learning.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class LeetCode131_PalindromePartitioning {

    public static void main(String[] args) {
        LeetCode131_PalindromePartitioning solution = new LeetCode131_PalindromePartitioning();
        System.out.println(solution.partition("aab"));
    }
    private int length;
    public List<String> partition(String s) {
        List<String> output = new ArrayList<>();
        length = s.length();
        perm(s, "", output);
        return output;
    }

    public void perm(String input, String perm, List<String> result) {
        //if (perm.length()==length) {
            result.add(perm);
          //  return;
        //}
        for (int i = 0; i < input.length(); i++) {
            String temp = input.substring(0, i) + input.substring(i + 1);
            perm(temp,perm+input.charAt(i),result);
        }
    }

    // Method to generate binary numbers of a given length
    public static void generateBinary(int n, String prefix) {
        if (n == 0) {
            System.out.println(prefix);
        } else {
            generateBinary(n - 1, prefix + "0");
            generateBinary(n - 1, prefix + "1");
        }
    }
}
