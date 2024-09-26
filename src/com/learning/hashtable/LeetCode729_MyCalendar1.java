package com.learning.hashtable;

import java.util.TreeMap;

public class LeetCode729_MyCalendar1 {
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
class MyCalendar {

    TreeMap<Integer, Integer> calendar;
    public MyCalendar() {
        calendar = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        Integer prevValue=calendar.lowerKey(end);
        System.out.println(prevValue);
        if(prevValue!=null && calendar.get(prevValue)-1>=start){
            return false;
        }
        calendar.put(start,end);
        return true;
    }
}

