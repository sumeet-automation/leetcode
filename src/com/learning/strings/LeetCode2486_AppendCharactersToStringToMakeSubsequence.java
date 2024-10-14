package com.learning.strings;

public class LeetCode2486_AppendCharactersToStringToMakeSubsequence {

    public int appendCharacters(String s, String t) {
        int p1 = 0;
        int p2 = 0;
        int sLength = s.length();
        int tLength = t.length();
        while (p1 < sLength && p2 < tLength) {
            if (s.charAt(p1) == t.charAt(p2)) {
                p2++;
            }
            p1++;
        }
        return tLength - p2;

    }

    public int appendCharacters2(String s, String t) {
        int tMax = 0;
        for (int i = 0; i < s.length() && tMax < t.length(); i++) {
            if (s.charAt(i) == t.charAt(tMax)) {
                tMax++;
            }
        }
        return t.length() - tMax;
    }
}
