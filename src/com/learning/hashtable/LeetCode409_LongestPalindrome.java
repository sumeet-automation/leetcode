package com.learning.hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode409_LongestPalindrome {

    public static void main(String[] args) {
        //System.out.println(longestPalindrome("ccdddc"));
        //System.out.println(longestPalindrome("cccaabb"));
        //System.out.println(longestPalindrome("bb"));
        System.out.println(longestPalindrome("dddccc"));
        //System.out.println(longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));

        int[] countArray = new int[26];
        for (char c : "dddccc".toCharArray()) {
            countArray[c - 'a']++;
        }
        for (int i = 0; i < countArray.length; i++) {
            char b = (char) (i+'a');
            System.out.println(b+" - "+countArray[i]);
        }
    }


public static int longestPalindrome(String s) {
    Map<String, Integer> countMap = new HashMap<>();
    for (String letter : s.split("")) {
        countMap.compute(letter, (k, v) -> v == null ? 1 : v + 1);
    }
    System.out.println(countMap);
    var sum1 = countMap.values().stream().filter(x -> x % 2 == 0)
            .mapToInt(Integer::intValue)
            .sum();
    var sum2 = countMap.values().stream().filter(x -> x % 2 != 0)
            .mapToInt(Integer::intValue).
            sorted();
    //aaa bbb cccdd
    return 0;
}
}
