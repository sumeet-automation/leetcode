package com.learning.maths;

import java.util.stream.IntStream;

public class LeetCode263_UglyNumber {

    public static void main(String[] args) {
        LeetCode263_UglyNumber solution = new LeetCode263_UglyNumber();
        System.out.println(solution.isUgly(612));
    }
    public boolean isUgly(int n) {
        if(n<2) return true;
        while (n%2==0) n=n/2;
        while (n%3==0) n=n/3;
        while (n%5==0) n=n/5;
        return n==1;
    }

}
