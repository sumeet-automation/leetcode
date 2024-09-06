package com.learning.dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class LeetCode {

    public static void main(String[] args) {
        LeetCode solution = new LeetCode();
        System.out.println(solution.countEven(4));
    }
    public int countEven(int num) {
        return (int) IntStream.rangeClosed(1,num).filter(x->sumOfDigit(x)%2==0).count();
    }

    private int sumOfDigit(int num) {
        int sum=0;
        while (num != 0) {
            int digit = num % 10;
            sum+=digit;
            num/=10;
        }
        return sum;
    }
}
