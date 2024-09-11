package com.learning.strings;

import java.util.Arrays;

public class LeetCode1370_IncreasingDecreacingString {

    public static void main(String[] args) {
        LeetCode1370_IncreasingDecreacingString solution = new LeetCode1370_IncreasingDecreacingString();
        System.out.println(solution.sortString("rat"));
    }
    public String sortString(String s) {
        int[] countCharacter = new int[26];
        for (char c : s.toCharArray()) {
            countCharacter[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        boolean nextLoop=true;
        System.out.println(Arrays.toString(countCharacter));
        for (int j = 0; j < s.length(); j++) {


            for (int i = 0; i < 26; i++) {
                if (countCharacter[i] != 0) {
                    char x = (char) (i + 'a');
                    sb.append(x);
                    System.out.println(x);
                    countCharacter[i]--;
                }
            }

            for (int i = 25; i >= 0; i--) {
                if (countCharacter[i] != 0) {
                    char x = (char) (i + 'a');
                    sb.append(x);
                    countCharacter[i]--;
                }
            }
        }
        System.out.println(Arrays.toString(countCharacter));
        return sb.toString();
    }
}
