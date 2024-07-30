package com.learning.array;

public class Question23_MaximumProfit {

    public static void main(String[] args) {
        System.out.println(maximumProfitDay(new int[]{1,2,4}));
    }

    private static int maximumProfitDay(int[] prices) {
        int maxProfit=0;
        int left = 0;
        for (int right = 1; right < prices.length; right++) {
            if(prices[left]<prices[right]){
                int profit = prices[right] - prices[left];
                if(profit>maxProfit)
                    maxProfit = profit;
                //right++;
            } else {
                left=right;
            }
        }
        return maxProfit;
    }
}
