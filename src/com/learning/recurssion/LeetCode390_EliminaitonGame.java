package com.learning.recurssion;

public class LeetCode390_EliminaitonGame {

    public static void main(String[] args) {
        LeetCode390_EliminaitonGame solution = new LeetCode390_EliminaitonGame();
        System.out.println(solution.lastRemaining(17));
    }
    public int lastRemaining(int n) {
        boolean left = true;
        int remaining = n, step = 1, head = 1;
        while (remaining > 1) {
            if (left || ((remaining & 1) != 0)) {
                head += step;
            }
            step *= 2;
            remaining /= 2;
            left = !left;
        }
        return head;
    }
}
