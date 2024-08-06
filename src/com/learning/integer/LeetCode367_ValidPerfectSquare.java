package com.learning.integer;

import java.util.stream.IntStream;

public class LeetCode367_ValidPerfectSquare {

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(2000105819));
    }
    public static boolean isPerfectSquare(int num) {
        long mid = 1 + (num - 1)/2;
        return IntStream.range(1, num/2)
                .anyMatch(i -> i * i == num && mid<num);
    }
}
