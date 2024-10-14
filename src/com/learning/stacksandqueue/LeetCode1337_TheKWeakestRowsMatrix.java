package com.learning.stacksandqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LeetCode1337_TheKWeakestRowsMatrix {

    public int[] kWeakestRows(int[][] mat, int k) {
        record Soldier(int count, int index){};
        //List<Soldier> soldierList = new ArrayList<>();
        PriorityQueue<Soldier> soldierList = new PriorityQueue<>(Comparator.comparing(Soldier::count).thenComparing(Soldier::index));
        int[] soldiers = new int[k];
        for(int i=0;i<mat.length;i++){
            int sum=0;
            for(int j=0;j<mat[0].length;j++){
                sum+=mat[i][j];
            }
            soldierList.add(new Soldier(sum,i));
        }
        //soldierList.sort(Comparator.comparing(Soldier::count).thenComparing(Soldier::index));
        for(int i=0;i<k;i++){
            soldiers[i]=soldierList.poll().index();
        }

        return soldiers;
    }
}
