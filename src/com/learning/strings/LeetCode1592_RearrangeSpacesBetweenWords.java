package com.learning.strings;

public class LeetCode1592_RearrangeSpacesBetweenWords {
    public static void main(String[] args) {
        LeetCode1592_RearrangeSpacesBetweenWords solution = new LeetCode1592_RearrangeSpacesBetweenWords();
        System.out.println(solution.reorderSpaces(" practice   makes   perfect"));
        System.out.println();
    }

    public String reorderSpaces(String text) {
        int noOfSpaces = 0;
        for (char c : text.toCharArray()) {
            if (c == ' ') noOfSpaces++;
        }
        int noOfWords = text.split(" \\s+").length;
        StringBuilder sb = new StringBuilder();
        int dist = noOfSpaces / (noOfWords - 1);
        for (String s : text.split(" \\s+")) {
            if(noOfSpaces>dist) {
                sb.append(s.trim());
                sb.append(" ".repeat(dist));
                noOfSpaces-=dist;
            }
        }
        noOfSpaces+=dist;
        if(noOfSpaces!=0){
            sb.append(" ".repeat(noOfSpaces));
        }
        return sb.toString();
    }

    public int countSeniors(String[] details) {
        int count = 0;
        for (String person : details) {
            int digit1 = (person.toCharArray()[11] - '0');
            int digit2 = (person.toCharArray()[12] - '0');
            int age = (digit1 * 10) + digit2;
            if (age > 60) count++;
        }
        return count;
    }
}
