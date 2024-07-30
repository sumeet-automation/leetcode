package com.learning.strings;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LeetCode2351_FirstLetterToAppearTwice {

    public static void main(String[] args) {
        System.out.println(equalFrequency("bac"));
        //c-3 a-2 d -2 e 2, f-4
        //3,2,
    }

    public static boolean equalFrequency(String word) {
        var countMap = Arrays.stream(word.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
         /*if(countMap.values().stream().distinct().count()==1){
             return true;
         } else*/ if(countMap.values().stream().distinct().count()==2) {
            var set = countMap.values().stream().distinct().collect(Collectors.toList());
             var diff = Math.abs(set.get(0)-set.get(1));
             return diff==1;
         }
         else return false;
    }
}
