package com.learning.hashtable;

import java.util.*;

public class LeetCode2284_SenderWithLargestWordCount {

    public static void main(String[] args) {
        System.out.println(new LeetCode2284_SenderWithLargestWordCount()
                .largestWordCount(new String[]{"Hello userTwooo", "Hi userThree us us s", "Wonderful day Alice", "Nice day userThree"},
                        new String[]{"Alice", "UserTwo", "UserThree", "Alice"}));
    }
    public String largestWordCount(String[] messages, String[] senders) {
        Map<String, Integer> persons = new TreeMap<>();
        for (int i = 0; i < messages.length; i++) {
            int finalI = i;
            persons.compute(senders[i], (k, v) -> v == null ?
                    messages[finalI].split(" ").length :
                    v + messages[finalI].split(" ").length);
        }
        int maxValue = Collections.max(persons.values());
        return persons.entrySet().stream()
                        .filter(x->x.getValue()==maxValue)
                .max(Map.Entry.comparingByKey()).get().getKey();
    }
}
