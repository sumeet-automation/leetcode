package com.learning.strings;

public class LeetCode2399_CheckDistancesBetweenSameLetters {

    public boolean checkDistances(String s, int[] distance) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (distance[c - 'a'] != s.lastIndexOf(String.valueOf(c)) - s.indexOf(String.valueOf(c)) - 1) {
                return false;
            }
        }
        return true;
    }
}
