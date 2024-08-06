package com.learning.strings;

import java.util.Arrays;

public class LeetCode848_ShiftLetters_WIP {

    public static void main(String[] args) {
        System.out.println(shiftingLetters("bad", new int[]{10,20,30}));
    }

    //baa
    //dca
    //gfd
    public static String shiftingLetters(String s, int[] shifts) {
        //1,2,3
        char[] alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        final int sum = Arrays.stream(shifts).sum()%26;
        System.out.println(sum);
        int nshifts[] = new int[shifts.length];
        nshifts[0] = sum;
        nshifts[shifts.length-1] = shifts[shifts.length-1]%26;
        for (int x = 1; x < shifts.length-1; x++) {
            System.out.println(x + "----" + (sum - shifts[x - 1]));
            nshifts[x] = sum - shifts[x - 1] > 0 ? sum - shifts[x - 1] :  26+(sum - shifts[x - 1]);
        }
        //nshifts = Arrays.copyOfRange(nshifts, 0, count);
        System.out.println(Arrays.toString(nshifts));
        char[] output = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            output[i] = alphabets[Math.abs((int) s.charAt(i) + nshifts[i] - 97)];
        }
        return new String(output);
    }
}
