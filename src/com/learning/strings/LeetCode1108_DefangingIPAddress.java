package com.learning.strings;

public class LeetCode1108_DefangingIPAddress {

    public static void main(String[] args) {
        LeetCode1108_DefangingIPAddress solution = new LeetCode1108_DefangingIPAddress();
        System.out.println(solution.defangIPaddr("1.1.1.1"));
    }
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.","\\[\\.\\]");
    }
}
