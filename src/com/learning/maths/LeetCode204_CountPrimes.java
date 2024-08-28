package com.learning.maths;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class LeetCode204_CountPrimes {

    public static void main(String[] args) {
        LeetCode204_CountPrimes solution = new LeetCode204_CountPrimes();
        //System.out.println(solution.countPrimes(5220));
        System.out.println(solution.countPrimes(4));
    }

    //Sieve of Erathosthenes algorightm
    public int countPrimes(int n) {
        boolean[] primes = new boolean[n];
        int count=0;
        for (int i = 2; i < n; i++) {
            if (!primes[i]) {
                count++;
                for (int j = i+i; j < n; j+=i) {
                    primes[j] = true;
                }
            }
        }
        return count;
    }



}
