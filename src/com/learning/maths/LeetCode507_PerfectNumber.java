package com.learning.maths;

import java.util.stream.IntStream;

public class LeetCode507_PerfectNumber {

    public static void main(String[] args) {
        System.out.println(new LeetCode507_PerfectNumber().checkPerfectNumber(2372));
    }
    public boolean checkPerfectNumber(int num) {
        int divisorSum = IntStream.rangeClosed(1, (num / 2) + 1)
                .filter(x -> num % x == 0).sum();
        System.out.println(divisorSum);
        return divisorSum==1 || divisorSum >num?false : divisorSum==0;
    }
}
