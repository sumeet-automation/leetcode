package com.learning.recurssion;

import java.util.ArrayList;
import java.util.List;

public class Question99_ArrayPermutation {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3};
        //permutationOfArray(array);
    }

    private static void permutationOfArray(int[] array, List<List<Integer>> list, List<Integer> perm) {
        if (array.length==perm.size()) {
            list.add(new ArrayList<>(perm));
        }
        for (int i = 0; i < array.length; i++) {
            if(list.contains(array[i])) continue;;
            perm.add(array[i]);
            permutationOfArray(array, list, perm);
            perm.remove(perm.size() - 1);
        }
    }
}
