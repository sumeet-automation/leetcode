package com.learning.array;

public class LeetCode1550_ThreeConsecutiveOdds {

    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if(num%2==1) {
                count++;
                if (count == 3) return true;
            }
            else count = 0;
        }
        return false;
    }
}
