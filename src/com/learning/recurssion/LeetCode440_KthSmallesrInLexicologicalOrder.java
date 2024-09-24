package com.learning.recurssion;

import java.util.Comparator;
import java.util.stream.LongStream;

public class LeetCode440_KthSmallesrInLexicologicalOrder {

    public static void main(String[] args) {
        LeetCode440_KthSmallesrInLexicologicalOrder solution = new LeetCode440_KthSmallesrInLexicologicalOrder();
        System.out.println(solution.findKthNumber(5439199, 1988));
    }

    public int findKthNumber(int n, int k) {
        return Integer.valueOf(LongStream.rangeClosed(1, n).mapToObj(String::valueOf)
                .sorted(Comparator.naturalOrder())
                .skip(k)
                .findFirst().orElse("1"));
    }
}
