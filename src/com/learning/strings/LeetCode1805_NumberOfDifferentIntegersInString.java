package com.learning.strings;

import java.math.BigInteger;
import java.util.Arrays;

public class LeetCode1805_NumberOfDifferentIntegersInString {

    public static void main(String[] args) {
        System.out.println(new LeetCode1805_NumberOfDifferentIntegersInString()
                .numDifferentIntegers("a1b01c001"));
    }

    public int numDifferentIntegers(String word) {
        //word = word.replaceAll("[^\\d+]"," ");
        return (int) Arrays.stream(word.split("[^\\d+]")).filter(x -> !x.isEmpty())
                .map(BigInteger::new)
                .peek(System.out::println)
                .distinct().count();

        //System.out.println(Arrays.stream(word.split("[^\\d+]")).mapToInt(Integer::parseInt).count());
    }
}
