package com.learning.strings;

public class LeetCode1678_GoalParsesInformation {

    public static void main(String[] args) {
        LeetCode1678_GoalParsesInformation solution = new LeetCode1678_GoalParsesInformation();
        System.out.println(solution.interpret("G()(al)"));
    }
    public String interpret(String command) {
        //G()(al)
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < command.length(); ) {
            if(command.charAt(i)=='G') {
                output.append('G');
                i++;
            }
            else if (command.charAt(i)=='(' && command.charAt(i+1)==')' ) {
                output.append('o');
                i = i + 2;
            } else {
                output.append("al");
                i = i + 4;
            }
        }
        return output.toString();
    }
}
