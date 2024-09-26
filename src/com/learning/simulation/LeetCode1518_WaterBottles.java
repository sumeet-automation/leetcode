package com.learning.simulation;

public class LeetCode1518_WaterBottles {

    public static void main(String[] args) {
        LeetCode1518_WaterBottles solution = new LeetCode1518_WaterBottles();
        //System.out.println(solution.numWaterBottles(9, 3));
        System.out.println(solution.numWaterBottles(15, 4));
    }

    public int numWaterBottles(int numBottles, int numExchange) {
        int totalBottles = numBottles;
        int emptyBottles = numBottles;

        while (emptyBottles >= numExchange) {
            int newBottles = emptyBottles / numExchange;
            totalBottles += newBottles;
            emptyBottles = newBottles + (emptyBottles % numExchange);
        }
        return totalBottles;
    }
}
