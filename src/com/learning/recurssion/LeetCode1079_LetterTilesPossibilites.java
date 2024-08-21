package com.learning.recurssion;

import java.util.HashSet;
import java.util.Set;

public class LeetCode1079_LetterTilesPossibilites {

    public static void main(String[] args) {
        System.out.println(new LeetCode1079_LetterTilesPossibilites()
                .numTilePossibilities("AAB"));
    }

    public int numTilePossibilities(String tiles) {
        Set<String> output = new HashSet<>();
        perm(tiles, "", output);
        return output.size();
    }

    public void perm(String input, String perm, Set<String> currAns) {
        if (!perm.isEmpty()) {
            currAns.add(perm);
            System.out.println(perm);
        }
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            String temp = input.substring(0, i) + input.substring(i + 1);
            perm(temp, perm + ch, currAns);
        }
    }
}
