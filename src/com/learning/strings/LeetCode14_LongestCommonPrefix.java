package com.learning.strings;

public class LeetCode14_LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"ab", "a"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        //["flower","flow","flight"]
        String prefix = strs[0];
        for (int j = 1; j < strs.length; j++) {
            String word = strs[j];
            //while (word.startsWith(prefix)){
            while (word.indexOf(prefix) != 0){
                    prefix = prefix.substring(0, prefix.length() - 1);
                    if(prefix.isEmpty()) return "";
                }
            }
        return prefix;
    }
}
