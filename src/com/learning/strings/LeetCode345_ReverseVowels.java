package com.learning.strings;

import java.util.ArrayList;
import java.util.List;

public class LeetCode345_ReverseVowels {

    public static void main(String[] args) {
        System.out.println(new LeetCode345_ReverseVowels().reverseVowels("lEetcode"));
    }

    public String reverseVowels(String s) {
        s=s.toLowerCase();
        List<String> vowels = List.of("a", "e", "i", "o", "u","A","E","I","O","U");
        List<String> vowelsList = new ArrayList<>();

        for (String letter : s.split("")) {
            if(vowels.contains(letter))
                vowelsList.add(letter);
        }
        vowelsList=vowelsList.reversed();
        String output = "";
        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(String.valueOf(s.charAt(i)))) {
                output+=vowelsList.get(0);
                vowelsList.remove(0);
            } else
                output+=s.charAt(i);
        }
        return output;
    }
}
