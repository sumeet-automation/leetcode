package com.learning.hashtable;

import java.util.HashSet;

public class LeetCode1346_CheckIfNAndItsDoubleExists {
    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[]{3,1,7,11}));
    }
    public static boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            System.out.println(i/2);
            if((set.contains(i/2) && i%2==0) || set.contains(i*2)) return true;
            else set.add(i);
        }
        return false;
    }
}
