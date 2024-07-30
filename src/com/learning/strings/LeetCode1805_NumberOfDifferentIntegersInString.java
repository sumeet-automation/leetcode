package com.learning.strings;

import java.util.Arrays;

public class LeetCode1805_NumberOfDifferentIntegersInString {

    public static void main(String[] args) {
        System.out.println(new LeetCode1805_NumberOfDifferentIntegersInString()
                .numDifferentIntegers("2393706880236110407059624696967828762752651982730115221690437821508229419410771541532394006597463715513741725852432559057224478815116557380260390432211227579663571046845842281704281749571110076974264971989893607137140456254346955633455446057823738757323149856858154529105301197388177242583658641529908583934918768953462557716"));
    }

    public int numDifferentIntegers(String word) {
        //word = word.replaceAll("[^\\d+]"," ");
        return (int) Arrays.stream(word.split("[^\\d+]")).filter(x -> !x.isEmpty())
                .map(Long::parseLong).distinct().count();

        //System.out.println(Arrays.stream(word.split("[^\\d+]")).mapToInt(Integer::parseInt).count());
    }
}
