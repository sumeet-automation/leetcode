package com.learning.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class LeetCode70_ClimbStairs {

    public static void main(String[] args) {
        LeetCode70_ClimbStairs solution = new LeetCode70_ClimbStairs();
        System.out.println(solution.climbStairsUsingRecussion(10));
        System.out.println(solution.climbStairsUsingMemorization(10));
        System.out.println(solution.climbStairsUsingBottomDown(10));
        System.out.println(solution.climbStairsUsingOptimazation(10));
    }
    public int climbStairsUsingRecussion(int n) {
        if (n <= 2) {
            return n;
        }
        return climbStairsUsingRecussion(n - 1) + climbStairsUsingRecussion(n - 2);
    }

    //Top-Down Approach
    public int climbStairsUsingMemorization(int n) {
        Map<Integer, Integer> memorization = new HashMap<>();
        memorization.put(1, 1 );
        memorization.put(2, 2 );
        return climbStairsUsingMemorization(n,memorization);
    }

    private int climbStairsUsingMemorization(int n, Map<Integer, Integer> memorization) {
        if (memorization.containsKey(n)) {
            return memorization.get(n);
        }
        memorization.put(n, climbStairsUsingMemorization(n - 1,memorization) + climbStairsUsingMemorization(n - 2,memorization));
        return memorization.get(n);
    }

    public int climbStairsUsingBottomDown(int n){
        if(n<=1) return 1;
        int[] dp = new int[n + 1];
        dp[0]=1;
        dp[1]=2;
        for (int i = 2; i <= n; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n-1];
    }
    public int climbStairsUsingOptimazation(int n){
        if(n<=1) return 1;
        int twoStepsBehind=1, oneStepBehind=2;
        for (int i = 3; i <= n; i++) {
            int current=twoStepsBehind+oneStepBehind;
            twoStepsBehind=oneStepBehind;
            oneStepBehind=current;
        }
        return oneStepBehind;
    }
}
