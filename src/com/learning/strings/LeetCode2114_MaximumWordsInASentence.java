package com.learning.strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class LeetCode2114_MaximumWordsInASentence {

    public static void main(String[] args) {
        System.out.println(mostWordsFound(new String[]{
                "alice and bob love leetcode",
                "i think so too",
                "this is great thanks very much"
        }));

        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
        sortPeople(names, heights);
    }


    public static int mostWordsFound(String[] sentences) {
        return Arrays.stream(sentences)
                .map(x -> x.split(" ").length).max(Comparator.naturalOrder()).get();
    }

    public static void sortPeople(String[] names, int[] heights) {
        record Person(String name, int height) implements Comparable<Person> {
            @Override
            public int compareTo(Person o1) {
                return o1.height - this.height;
            }
        }
        ;
        System.out.println(Arrays.toString(IntStream.range(0, names.length).mapToObj(x -> new Person(names[x], heights[x]))
                .sorted()
                .map(x -> x.name)
                .toArray()));
    }
}
