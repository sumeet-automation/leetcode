package com.learning.maths;

public class LeetCode1716_CountMoneyInBank {

    public static void main(String[] args) {
        LeetCode1716_CountMoneyInBank solution = new LeetCode1716_CountMoneyInBank();
        System.out.println(solution.totalMoney(20));
    }
    public int totalMoney(int n) {
        int totalMoney =0;
        int weeks = n/7;
        int days = n%7;
        int a =0;
        for(int i=0; i<weeks; i++){
            a++;
            //AP
            totalMoney += (7*(2*a+6))/2;
        }
        for(int i=0; i<days; i++){
            totalMoney += ++a;
        }
        return totalMoney;
    }
}
