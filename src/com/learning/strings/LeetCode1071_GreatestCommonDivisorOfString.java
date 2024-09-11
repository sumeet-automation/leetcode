package com.learning.strings;

public class LeetCode1071_GreatestCommonDivisorOfString {

    public static void main(String[] args) {
        LeetCode1071_GreatestCommonDivisorOfString solution = new LeetCode1071_GreatestCommonDivisorOfString();
        System.out.println(solution.gcdOfStrings("ABCABC", "ABC"));
        System.out.println(solution.gcdOfStrings("ABCABC", "A"));
        System.out.println(solution.gcdOfStrings("ABABAB", "ABAB"));
        System.out.println(solution.gcdOfStrings("LEET", "CODE"));
        System.out.println(solution.gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
        System.out.println(solution.gcdOfStrings("ABABABAB", "ABAB"));
    }

    public String gcdOfStrings(String str1, String str2) {
        if (str2.length() > str1.length()) return gcdOfStrings(str2, str1);
        if (str2.equals(str1)) return str1;
        if (str1.startsWith(str2)) return gcdOfStrings(str1.substring(str2.length()), str2);
        return "";
    }
}
