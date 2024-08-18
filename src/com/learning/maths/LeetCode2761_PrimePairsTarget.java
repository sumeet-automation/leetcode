package com.learning.maths;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class LeetCode2761_PrimePairsTarget {

    public static void main(String[] args) {
        System.out.println(new LeetCode2761_PrimePairsTarget().findPrimePairs(100000));
    }

    private boolean isPrimeNumber(int i) {
        return !IntStream.range(2, i )
                .anyMatch(x -> i % x == 0);
    }
    public List<List<Integer>> findPrimePairs(int n) {
        //2, 3, 5, 7
        List<List<Integer>> output = new ArrayList<>();
        boolean[] primeArrays = new boolean[n];
        for (int i = 2; i < n; ++i) {
            if (primeArrays[i]) {
                for (int j = i + i; j < n; j += i) {
                    primeArrays[j] = false;
                }
            }
        }    for (int x = 2; x <= n / 2; x++) {
            int y = n - x;
            if (primeArrays[x] && primeArrays[y]) {
                output.add(List.of(x, y));
            }
        }

        return output;
    }
}
