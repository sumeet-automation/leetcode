package com.learning.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class LeetCode771_JewelsAndStones {

    public static void main(String[] args) {
        LeetCode771_JewelsAndStones solution = new LeetCode771_JewelsAndStones();
        System.out.println(solution.numJewelsInStones("aA", "aazzaAA"));
        System.out.println(solution.numJewelsInStones2("aA", "aazzaAA"));
    }
    public int numJewelsInStones(String jewels, String stones) {
        Map<String, Integer> stoneCount = new HashMap<>();
        for (String stone : stones.split("")) {
            stoneCount.compute(stone, (k, v) -> v == null ? 1 : v+1);
        }
        int stoneSum=0;
        for (var jewel : jewels.split("")) {
            stoneSum += stoneCount.getOrDefault(jewel, 0);
        }
        return stoneSum;
    }

    public int numJewelsInStones2(String jewels, String stones) {
        int[] s = new int[128];
        for (char c : jewels.toCharArray()) {
            s[c] = 1;
        }
        int ans = 0;
        for (char c : stones.toCharArray()) {
            ans += s[c];
        }
        return ans;
    }
}
