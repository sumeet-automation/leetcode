package com.learning.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LeetCode1662_CheckIfTwoStringArraysAreEquivalent {


    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return Arrays.stream(word1).collect(Collectors.joining("")).equals(Arrays.stream(word2).collect(Collectors.joining("")));
    }
}
