package com.learning.strings;

public class LeetCode1880_CheckIfWordEqualsSummationOfTwoWords {

    public static void main(String[] args) {
        System.out.println(isSumEqual("abc", "bcd", "fff"));
    }

    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        //"abccc"
        int sum1 = getSummation(firstWord);
        int sum2 = getSummation(secondWord);
        int sum3 = getSummation(targetWord);
        return sum1+sum2==sum3;
    }

    public static int getSummation(String word) {
        //String output = "";
        int output = 0;
        for (int i = 0; i < word.length(); i++) {
            output += word.charAt(i) - 'a';
        }
        return output;
    }

}
