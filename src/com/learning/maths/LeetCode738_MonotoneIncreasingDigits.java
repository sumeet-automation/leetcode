package com.learning.maths;

public class LeetCode738_MonotoneIncreasingDigits {

    public static void main(String[] args) {
        System.out.println(new LeetCode738_MonotoneIncreasingDigits().monotoneIncreasingDigits(777616726));
    }
    public int monotoneIncreasingDigits(int n) {
        if(n==0) return 0;
        while (n > 0) {
            if (isMonotone(String.valueOf(n))) {
                return n;
            }
            n--;
        }
        return 0;
    }

    public boolean isMonotone(String n) {
        for (int i = 1; i < n.length(); i++) {
            if ((int) n.charAt(i) < (int) n.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }
}
