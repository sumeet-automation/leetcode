package com.learning.array;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LeetCode179_LargestNumber {
    public static void main(String[] args) {
        largestNumber(new int[]{3,30,34,5,9});
    }
    public static String largestNumber(int[] nums) {
        String output =  Arrays.stream(nums)
                .mapToObj(String::valueOf)
                .sorted((a, b) -> (b + a).compareTo(a + b))
                .collect(Collectors.joining(""));
        return output.startsWith("0") && output.endsWith("0") ? "0" : output;
    }
}
