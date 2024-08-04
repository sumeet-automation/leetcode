package com.learning.strings;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.HashMap;
import java.util.Map;

public class LeetCode1189_MaximumNumberOfBalloons {

    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("xpballoo"));
    }
    public static int maxNumberOfBalloons(String text) {
        //loonbalxballpoon
        //String word = "balloon";
        Map<String, Integer> countMap = new HashMap<>();
        for (String letter : text.split("")) {
            countMap.compute(letter, (k, v) -> {
                if(k.equals("b") || k.equals("a") ||k.equals("l") ||k.equals("o") ||k.equals("n"))
                return v == null ? 1 : v + 1;
                return null;
            });
        }
        int min1 = Math.min(countMap.getOrDefault("b", 0),
                Math.min(countMap.getOrDefault("a", 0), countMap.getOrDefault("n", 0)));
        int min2 = Math.min(countMap.getOrDefault("l", 0), countMap.getOrDefault("o", 0));
        return Math.min(min1,min2/2);
    }
}
