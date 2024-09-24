package com.learning.hashtable;

import java.util.HashSet;
import java.util.Set;

public class LeetCode3043_LengthLongestCommonPrefix {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 10, 100};
        int[] arr2 = new int[]{1000};
        LeetCode3043_LengthLongestCommonPrefix solution = new LeetCode3043_LengthLongestCommonPrefix();
        System.out.println(solution.longestCommonPrefix(arr1, arr2));
    }
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<String> set = new HashSet<>();
        for (int num : arr1) {
            String numValue = String.valueOf(num);
            for (int i = 1; i <= numValue.length(); i++) {
                set.add(numValue.substring(0, i));
            }
        }
        int maxLength = 0;
        for (int num : arr2) {
            String numValue = String.valueOf(num);
            for (int i = 1; i <= numValue.length(); i++) {
                if(set.contains(numValue.substring(0, i))){
                    maxLength = Math.max(maxLength, i);
                }
            }
        }
        return maxLength;
    }

}
