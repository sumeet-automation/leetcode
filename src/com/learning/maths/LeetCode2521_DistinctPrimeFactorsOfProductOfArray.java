package com.learning.maths;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LeetCode2521_DistinctPrimeFactorsOfProductOfArray {

    public static void main(String[] args) {
        LeetCode2521_DistinctPrimeFactorsOfProductOfArray solution = new LeetCode2521_DistinctPrimeFactorsOfProductOfArray();
        System.out.println(solution.distinctPrimeFactors(new int[]{2, 4, 8, 16}));
    }
    public int distinctPrimeFactors(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.addAll(primeFactors(num));
        }
        return set.size();
    }

    public Set<Integer> primeFactors(int num) {
        Set<Integer> output = new HashSet<>();
        for(int i = 2; i<= num; i++) {
            while(num%i == 0) {
                output.add(i);
                num = num/i;
            }
        }
        return output;
    }
}
