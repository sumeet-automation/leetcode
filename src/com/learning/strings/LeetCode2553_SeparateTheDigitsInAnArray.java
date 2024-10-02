package com.learning.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode2553_SeparateTheDigitsInAnArray {

    public static void main(String[] args) {
        LeetCode2553_SeparateTheDigitsInAnArray solution = new LeetCode2553_SeparateTheDigitsInAnArray();
        System.out.println(Arrays.toString(solution.separateDigits(new int[]{13, 25, 83, 77})));
    }
    public int[] separateDigits(int[] nums) {
        List<Character> list = new ArrayList<>();
        for (int num : nums) {
            String x = String.valueOf(num);
            for (int i = 0; i < x.length(); i++) {
                list.add(x.charAt(i));
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i)-'0';
        }
        return res;
    }
}
