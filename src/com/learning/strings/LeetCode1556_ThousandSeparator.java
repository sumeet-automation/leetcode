package com.learning.strings;

public class LeetCode1556_ThousandSeparator {

    public static void main(String[] args) {
        System.out.println(987%10);
        LeetCode1556_ThousandSeparator solution = new LeetCode1556_ThousandSeparator();
        System.out.println(solution.thousandSeparator(876));
        System.out.println(solution.thousandSeparator(1239876));
        System.out.println(solution.thousandSeparator(1236));
    }
    public String thousandSeparator(int n) {
        if(n==0) return "0";
        StringBuilder sb = new StringBuilder();
        int count=0;
        while (n!=0){
            int digit = n % 10;
            if(count==3){
                sb.append('.');
                sb.append(Integer.valueOf(digit));
                count=0;
            } else {
                sb.append(Integer.valueOf(digit));
            }
            count++;
            n/=10;
        }
        return sb.reverse().toString();
    }

}
