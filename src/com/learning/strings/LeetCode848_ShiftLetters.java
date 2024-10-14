package com.learning.strings;

public class LeetCode848_ShiftLetters {

    public static void main(String[] args) {
        System.out.println((char)(((('u'+17)-97)%26)+97));
        System.out.println(shiftingLetters("ruu", new int[]{26,9,17}));
    }

    //baa
    //dca
    //gfd
    public static String shiftingLetters(String s, int[] shifts) {
        //1,2,3
        int[] nshifts = new int[shifts.length];
        nshifts[shifts.length-1] = shifts[shifts.length-1];
        int sum = shifts[shifts.length - 1];
        for (int i = shifts.length-2; i >=0; i--) {
            sum=(sum+shifts[i])%26;
            nshifts[i]+=sum;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append((char) ((((s.charAt(i) + nshifts[i]) - 'a') % 26) + 'a'));
        }
        return sb.toString();
    }
}

//System.out.println((char)((s.charAt(i)+nshifts[i])%26)+'a');
//sb.append((char) (s.charAt(i) + (nshifts[i]%26)));
//System.out.println(nshifts[i]);