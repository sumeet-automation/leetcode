package com.learning.array;

import java.util.StringJoiner;

public class LeetCode287_DuplicateNumber {

    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] % (nums2[j] * k) == 0) count++;
            }
        }
        return count;
    }

    public String convertDateToBinary(String date) {
        StringJoiner output = new StringJoiner("-");
        for (String s : date.split("-")) {
            output.add(binary(s));
        }
        return output.toString();
    }

    private String binary(String date) {
        int day = Integer.parseInt(date);
        StringBuilder sb = new StringBuilder();
        while (day > 0) {
            int digit = day % 2;
            sb.append(digit);
            day /= 2;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        LeetCode287_DuplicateNumber solution = new LeetCode287_DuplicateNumber();
        System.out.println(solution.convertDateToBinary("2080-02-29"));
    }

    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[(2 * i)+1] = nums[(2*i)+2];
        }
        return ans;
    }
}