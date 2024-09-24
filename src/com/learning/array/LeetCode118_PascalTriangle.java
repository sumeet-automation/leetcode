package com.learning.array;

import java.util.ArrayList;
import java.util.List;

public class LeetCode118_PascalTriangle {

    public static void main(String[] args) {
        LeetCode118_PascalTriangle solution = new LeetCode118_PascalTriangle();
        System.out.println(solution.generate(5));
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> firstRow = List.of(1);
        List<Integer> secondRow = List.of(1,1);
        output.add(firstRow);
        output.add(secondRow);
        for (int i = 3; i <= numRows; i++) {
            var lastRow = output.getLast();
            System.out.println(lastRow);
            List<Integer> curr = new ArrayList<>();
            for (int j = 1; j < lastRow.size(); j++) {
                curr.addFirst(1);
                curr.add(lastRow.get(j)+lastRow.get(j-1));
                curr.addLast(1);
            }
            output.add(curr);
        }
        return output;
    }
}
