package com.learning.hashtable;

import java.util.HashMap;
import java.util.Map;

public class LeeCode {

    public static void main(String[] args) {
        FrequencyTracker frequencyTracker = new FrequencyTracker();
        frequencyTracker.add(3);
        frequencyTracker.add(3);
        frequencyTracker.deleteOne(3);
        frequencyTracker.deleteOne(3);
        frequencyTracker.deleteOne(3);
    }
}

class FrequencyTracker {

   int[] values;
    int[] freq;


    public FrequencyTracker() {
        freq = new int[10001];
        values = new int[10001];
    }

    public void add(int number) {
        if(values[number]>0)
            freq[values[number]]--;
        values[number]++;
        freq[values[number]]++;
    }

    public void deleteOne(int number) {
        if(values[number]<0)
            freq[values[number]]--;
        values[number]--;
        freq[values[number]]++;
    }

    public boolean hasFrequency(int frequency) {
        if(freq[frequency]>0) return true;
        else return false;
    }


}