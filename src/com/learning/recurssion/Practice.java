package com.learning.recurssion;

import com.learning.maths.LeetCode633_SumOfSquares;

import java.util.*;
import java.util.stream.Collectors;

public class Practice {

    public static void main(String[] args) {
        //var set = new HashSet<String >();
        //permString("abc","",set);
        //System.out.println(set.stream().filter(x -> x.length() == 3).collect(Collectors.toSet()));
        //System.out.println(String.join(",", set));
        List<List<Integer>> output = new ArrayList<>();
        //permArray(new int[]{1,2,3}, new ArrayList<>(),output,0);
        permArray(new int[]{1,2,3}, new ArrayList<>(),output,0, new boolean[3]);
        System.out.println(output);
    }
    public static void permString(String input, String perm, Set<String> curr) {
        curr.add(perm);
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            String temp = input.substring(0, i) + input.substring(i + 1);
            permString(temp,perm+ch,curr);
        }
    }

    public static void permArray(int[] input, List<Integer> perm, List<List<Integer>> curr, int index) {
        curr.add(new ArrayList<>(perm));
        for (int i = index; i <= input.length; i++) {
            perm.add(input[i]);
            permArray(input,perm,curr,i+1);
            perm.removeLast();
        }
    }

    public static void permArray(int[] input, List<Integer> perm, List<List<Integer>> curr, int index, boolean[] visited) {
        curr.add(new ArrayList<>(perm));
        for (int i = 0; i < input.length; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            perm.add(input[i]);
            permArray(input,perm,curr,i+1, visited);
            perm.removeLast();
            visited[i] = false;
        }


    }
}
