package com.learning.array;

public class Question26_LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("a"));
    }

    //  e
    private static int lengthOfLastWord(String s) {
        int length = 0;
        int left = s.length()-1;
        for (int right = s.length()-1 ; right >= 0; ) {
            if (s.charAt(right) == ' ') {
                left = right;
                right--;
            } else {
                length = right - left;
                left--;
                if (s.charAt(left) == ' ') {
                    return length;
                }
            }
        }
        return length;
    }
}
