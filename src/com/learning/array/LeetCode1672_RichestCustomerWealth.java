package com.learning.array;

public class LeetCode1672_RichestCustomerWealth {

    public static void main(String[] args) {
        LeetCode1672_RichestCustomerWealth solution = new LeetCode1672_RichestCustomerWealth();
        solution.maximumWealth(new int[][]{{1, 5}, {7, 3}, {3, 5}});
    }
    public int maximumWealth(int[][] accounts) {
        int customers = accounts.length;
        int maxWealth = Integer.MIN_VALUE;
        for (int i = 0; i <customers ; i++) {
            int n = accounts[i].length;
            int sum = 0;
            for (int j = 0; j < n; j++) {
                 sum+=accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, sum);
        }
        return maxWealth;
    }
}
