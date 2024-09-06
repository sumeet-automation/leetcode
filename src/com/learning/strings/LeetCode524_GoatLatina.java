package com.learning.strings;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class LeetCode524_GoatLatina {

    /*
    If a word begins with a vowel ('a', 'e', 'i', 'o', or 'u'), append "ma" to the end of the word.
For example, the word "apple" becomes "applema".
If a word begins with a consonant (i.e., not a vowel), remove the first letter and append it to the end, then add "ma".
For example, the word "goat" becomes "oatgma".
Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
For example, the first word gets "a" added to the end, the second word gets "aa" added to the end, and so on.
     */

    public static void main(String[] args) {
        LeetCode524_GoatLatina solution = new LeetCode524_GoatLatina();
        System.out.println(solution.toGoatLatin("I speak Goat Latin"));
    }
    public String toGoatLatin(String sentence) {
        List<String> vowels = Arrays.asList("aeiouAEIOU".split(""));
        //StringBuilder sb = new StringBuilder();
        int trace = 1;
        StringJoiner sb = new StringJoiner(" ");
        for (String word : sentence.split(" ")) {
            String first = String.valueOf(word.charAt(0));
            StringBuilder stringBuilder = new StringBuilder();
            if (!vowels.contains(first)) {
                stringBuilder.append(word.substring(1)).append(first).append("ma").append("a".repeat(trace));
            } else {
                stringBuilder.append(word).append("ma").append("a".repeat(trace));
            }
            sb.add(stringBuilder.toString());
            trace++;
        }
        return sb.toString();
    }
}
