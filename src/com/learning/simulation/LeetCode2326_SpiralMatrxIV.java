package com.learning.simulation;

import com.learning.linkedlistandtree.predefine.ListNode;

import java.util.Arrays;

public class LeetCode2326_SpiralMatrxIV {

    public static void main(String[] args) {
        int[] array = new int[]{5, 38, 4, 6, 8, 9, 41};
        int max1, max2, max3;
        max1 = max2 = max3=Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max1) {
                max3=max2;
                max2 = max1;
                max1 = num;
            }
            else if (num > max2) {
                max3 = max2;
                max2 = num;
            }
            else if (num > max3) {
                max3 = num;
            }
        }
        System.out.println(max1+" --- "+max2+" ---- "+max3);
    }

    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(result[i], -1);
        }
        int topRow = 0;
        int bottomRow = m - 1;
        int leftColumn = 0;
        int rightColumn = n - 1;

        while (head != null) {
            //first row
            for (int col = leftColumn; col <= rightColumn; col++) {
                if (head == null) break;
                result[topRow][col] = head.val;
                head = head.next;
            }
            topRow++;
            //end column
            for (int row = topRow; row <= bottomRow; row++) {
                if (head == null) break;
                result[row][rightColumn] = head.val;
                head = head.next;
            }
            rightColumn--;
            //last row
            for (int col = rightColumn; col >= leftColumn; col--) {
                if (head == null) break;
                result[bottomRow][col] = head.val;
                head = head.next;
            }
            bottomRow--;

            //first column
            for (int row = bottomRow; row >= topRow; row--) {
                if (head == null) break;
                result[row][leftColumn] = head.val;
                head = head.next;
            }
            leftColumn++;
        }
        return result;
    }
}
