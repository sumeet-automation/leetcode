package com.learning.strings;

import java.util.ArrayList;
import java.util.List;

public class LeetCode2788_SplitStringsBySeparator {

    public List<String> splitWordsBySeparator(List<String> words, final char separator) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char ch: word.toCharArray()) {
                if (ch == separator) {
                    if (!sb.isEmpty()) {
                        result.add(sb.toString());
                        sb.setLength(0);
                    }
                } else {
                    sb.append(ch);
                }
            }

            if (!sb.isEmpty()) {
                result.add(sb.toString());
                sb.setLength(0);
            }
        }
        return result;
    }


    public List<String> splitWordsBySeparator2(List<String> words, char separator) {
        List<String> list = new ArrayList<>();
        String spliterator = "\\Q"+separator+"\\E";
        for(var word:words){
            for(var l:word.split(spliterator)){
                if(!l.isEmpty())
                    list.add(l);
            }
        }
        return list;
    }
}
