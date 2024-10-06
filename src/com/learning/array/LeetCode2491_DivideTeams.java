package com.learning.array;

import java.util.*;

public class LeetCode2491_DivideTeams {

    public static void main(String[] args) {
        LeetCode2491_DivideTeams solution = new LeetCode2491_DivideTeams();
        System.out.println(solution.dividePlayers(new int[]{3, 2, 5, 1, 3, 4}));
    }
    public long dividePlayers(int[] skill) {
        int sumSkills = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i : skill) {
            sumSkills += i;
            freq.put(i, freq.getOrDefault(i,0) + 1);
        }
        int reqSkillSum = sumSkills / (skill.length / 2);
        long product = 0;
        for (int i : skill) {
            if(freq.get(i)==0) continue;
            freq.put(i, freq.get(i) - 1);
            int pair = reqSkillSum - i;
            if(!freq.containsKey(pair) || freq.get(pair)==0)
                return -1;
            freq.put(pair, freq.get(pair) - 1);
            product = product + ((long) i * (long) pair);
        }
        return product;
    }

    public long dividePlayersUsingArray(int[] skill) {
        int n = skill.length;
        int teams = n/2;
        int totalSum=0;
        int[] freqMap = new int[1001];
        for(int element : skill){
            freqMap[element]++;
            totalSum += element;
        }
        if(totalSum % teams !=0 ){
            return -1;
        }
        int targetPoints = totalSum / teams;
        long res = 0;
        for(int element : skill){
            if(freqMap[element]==0){
                continue;
            }
            freqMap[element]--;
            int partner = targetPoints - element;
            if(freqMap[partner]==0){
                return -1;
            }
            freqMap[partner]--;
            res = res + ((long)element * (long)partner);
        }
        return res;
    }
}
