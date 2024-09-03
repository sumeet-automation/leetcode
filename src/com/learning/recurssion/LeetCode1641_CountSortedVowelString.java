package com.learning.recurssion;
public class LeetCode1641_CountSortedVowelString {

    public static void main(String[] args) {
        LeetCode1641_CountSortedVowelString solution = new LeetCode1641_CountSortedVowelString();
        System.out.println(solution.countVowelStrings(3));
    }

    public int countVowelStrings(int n) {
        //Using Mathematics
        return combination(n + 4, 4);
    }

    private int combination(int n, int k) {
        int res = 1;
        for (int i = 1; i <= k; i++) {
            res = res * (n - i + 1) / i;
        }
        return res;
    }
}
