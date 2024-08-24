package com.learning.strings;

public class LeetCode1653_MinimumDeletion {
    public static void main(String[] args) {
        System.out.println(minimumDeletions("aababbab"));
    }
    public static int minimumDeletions(String s) {
        StringBuilder sb = new StringBuilder(s);
        int count=0;
        while (sb.indexOf("ba")!=-1){
            int index=sb.indexOf("ba");
            sb.delete(index,index+2);
            count++;
        }
        return count;    }

}
