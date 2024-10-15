package com.learning.twopointers;

public class LeetCode2938_SeparateWhiteAndBlackBalls {

    public long minimumSteps(String s) {
        long blackBallCount = 0;
        long step = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                blackBallCount++;
            } else {
                step += blackBallCount;
            }
        }
        return step;
    }

    public long minimumStepsTwoPointer(String s) {
        int whitePosition = 0;
        long totalSwaps = 0;

        // Iterate through each ball (character) in the string
        for (int currentPos = 0; currentPos < s.length(); currentPos++) {
            if (s.charAt(currentPos) == '0') {
                // Calculate the number of swaps needed
                // to move it to leftmost available position
                totalSwaps += currentPos - whitePosition;

                // Move the next available position for a white ball one step to the right
                whitePosition++;
            }
        }

        return totalSwaps;
    }
}
