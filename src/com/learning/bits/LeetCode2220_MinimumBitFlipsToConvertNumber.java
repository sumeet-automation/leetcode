package com.learning.bits;

public class LeetCode2220_MinimumBitFlipsToConvertNumber {

    public static void main(String[] args) {
        LeetCode2220_MinimumBitFlipsToConvertNumber solution = new LeetCode2220_MinimumBitFlipsToConvertNumber();
        System.out.println(solution.minBitFlips(7, 10));
    }
    public int minBitFlips(int start, int goal) {
        int count = 0;
        int result = start^goal;
        while (result != 0) {
            result=result&(result-1);
            count++;
        }
        return count;
    }

}
