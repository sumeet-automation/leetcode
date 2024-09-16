package com.learning.maths;

public class LeeCode_1475FinalPricesWithSpecialDiscountInaShop {

    public int[] finalPrices(int[] prices) {
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i]) {
                    result[i] = prices[i] - prices[j];
                    break;
                }
                if (j == prices.length - 1) result[i] = prices[i];
            }
        }
        result[prices.length - 1] = prices[prices.length - 1];
        return result;
    }

}
