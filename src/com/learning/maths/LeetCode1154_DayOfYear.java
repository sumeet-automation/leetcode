package com.learning.maths;

public class LeetCode1154_DayOfYear {

    public static void main(String[] args) {
        dayOfYear("2004-03-01");
    }
    public static int dayOfYear(String date) {
        //Input: date = "2019-02-02"
        String[] dateSplit = date.split("-");
        int year = Integer.parseInt(dateSplit[0]);
        int month = Integer.parseInt(dateSplit[1]);
        int day = Integer.parseInt(dateSplit[2]);
        int countDays = 0;
        countDays+=day;
        if(month>1)
            countDays+=31;
        if(month>2 ) {
            if(year%4==0 || year%100!=0  ||year%400==0)
                countDays+=29;
            else
                countDays+=28;
        }
        if(month>3)
            countDays+=31;
        if(month>4)
            countDays+=30;
        if(month>5)
            countDays+=31;
        if(month>6)
            countDays+=30;
        if(month>7)
            countDays+=31;
        if(month>8)
            countDays+=31;
        if(month>9)
            countDays+=30;
        if(month>10)
            countDays+=31;
        if(month>11)
            countDays+=30;
        System.out.println(countDays);
        return countDays;
    }
}
