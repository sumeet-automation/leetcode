package com.learning.hashtable;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1460_CanArrayBeEqualByReversingSubArrays {

    public boolean canBeEqual(int[] target, int[] arr) {
        if(target.length!=arr.length) return false;
        Map<Integer, Integer> freqTarget = new HashMap<>();
        Map<Integer, Integer> arrFreq = new HashMap<>();
        for (int num : target) {
            freqTarget.compute(num, (k, v) -> v == null ? 1 : v + 1);
        }
        for (int num : arr) {
            arrFreq.compute(num, (k, v) -> v == null ? 1 : v + 1);
        }
        return freqTarget.equals(arrFreq);
    }

    public boolean canBeEqualUsingArrays(int[] target, int[] arr) {
        if(target.length!=arr.length) return false;
        int[] freq = new int[1001];
        for (int num : target) {
            freq[num]++;
        }

        for (int num : arr) {
            freq[num]--;
        }

        for (int i = 0; i < freq.length; i++) {
            if(freq[i]!=0) return false;
        }
        return true;
    }

}
