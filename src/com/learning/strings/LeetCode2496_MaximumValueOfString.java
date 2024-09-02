package com.learning.strings;

public class LeetCode2496_MaximumValueOfString {

    public static void main(String[] args) {
        LeetCode2496_MaximumValueOfString solution = new LeetCode2496_MaximumValueOfString();
        System.out.println(solution.maximumValue(new String[]{"alic3", "bob", "9","7i","iw1","61939","7","7i","cye","bv7yg","t3ye6","990" }));
    }
    public int maximumValue(String[] strs) {
        String regex = ".*[a-z].*";
        int maxValue = 0;
        for (String word : strs) {
            if(word.matches(regex)){
                maxValue = Math.max(maxValue, word.length());
            } else {
                maxValue = Math.max(maxValue, Integer.parseInt(word));
            }
        }
        return maxValue;
    }
}
