package com.learning.strings;

public class LeetCode1910_RemoveAllOccurrencesOfASubstring {

    public static void main(String[] args) {
        System.out.println(removeOccurrences("eemckxmckx", "emckx"));
        System.out.println(removeOccurrencesUsingReplace("eemckxmckx", "emckx"));
    }

    public static String removeOccurrencesUsingReplace(String s, String part) {
        while (s.contains(part)) {
            s.replaceFirst(part, "");
        }
        return s;
    }
    public static String removeOccurrences(String s, String part) {
        if(s.length()<part.length()) return s;
        StringBuilder sb = new StringBuilder(s);
        int index = sb.indexOf(part);
        System.out.println(index);
        while (index!= -1 && sb.length()>=part.length()) {
            System.out.println(index);
            sb = sb.delete(index,  index + part.length());
            index = sb.indexOf(part);
            System.out.println(sb);
        }
        return sb.toString();
    }
}
