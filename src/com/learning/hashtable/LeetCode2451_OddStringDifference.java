package com.learning.hashtable;

import java.util.*;

public class LeetCode2451_OddStringDifference {

    public static void main(String[] args) {
        LeetCode2451_OddStringDifference solution = new LeetCode2451_OddStringDifference();
        System.out.println(solution.oddString(new String[]{"ddd", "poo", "baa", "onn"}));
        System.out.println(solution.oddString(new String[]{"adc", "wzy", "abc"}));
        System.out.println(solution.arrangeCoins(6));
        System.out.println(solution.arrangeCoins(5));
        System.out.println(solution.diffWaysToCompute("2+3+5"));
    }

    public String oddString(String[] words) {
        List<List<Integer>> checker = new ArrayList<>();
        int length = words[0].length();
        for (String word : words) {
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i < length; i++) {
                list.add(word.charAt(i) - word.charAt(i - 1));
            }
            checker.add(list);
        }
        for ( int i=0;i<words.length;i++) {
            List<Integer> curr = checker.get(i);
            int idx=0;
            for (List<Integer> next : checker) {
                if(curr.equals(next)){
                    idx++;
                }
            }
            if (idx == 1) {
                return words[i];
            }
        }
        return words[0];
    }

    public int arrangeCoins(int n) {
        int row=1;
        while (n > 0) {
            row++;
            n-=row;
        }
        return row-1;
    }
    Map<String, List<Integer>> map = new HashMap<>();

    public List<Integer> diffWaysToCompute(String expression) {
        if(map.containsKey(expression)){
            return map.get(expression);
        }
        List<Integer> result = new ArrayList<>();
        for (int i=0;i<expression.length();i++) {
            char c =expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String leftExpression = expression.substring(0,i);
                String rightExpression = expression.substring(i+1);
                List<Integer> leftAns = diffWaysToCompute(leftExpression);
                List<Integer> rightAns = diffWaysToCompute(rightExpression);
                for (int x : leftAns) {
                    for (int y : rightAns) {
                        if (c == '+') {
                            result.add(x + y);
                        } else if (c == '-') {
                            result.add(x - y);
                        } else if (c == '*') {
                            result.add(x * y);
                        }
                    }
                }
            }
        }
        if(result.isEmpty()) result.add(Integer.parseInt(expression));
        map.put(expression, result);
        return result;
    }

}
