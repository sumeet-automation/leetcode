package com.learning.recurssion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LeetCode386_LexicologicalNumbers {

    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>();
        int curr = 1;
        for (int i = 1; i <= n; i++) {
            list.add(i, curr);
            if ((curr * 10) <= n) {
                curr *= 10;
            } else {
                while (curr % 10 == 9 || curr == n) {
                    curr /= 10;
                }
                curr += 1;
            }
        }
        return list;
    }

    public List<Integer> lexicalOrder2(int n) {
        List<String> toSort = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String value = String.valueOf(i);
            toSort.add(value);
        }
        toSort.sort(Comparator.naturalOrder());
        List<Integer> list = new ArrayList<>();
        for (String value : toSort) {
            Integer integer = Integer.valueOf(value);
            list.add(integer);
        }
        return list;
    }
}
