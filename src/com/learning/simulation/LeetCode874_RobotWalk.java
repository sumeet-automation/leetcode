package com.learning.simulation;

import java.util.*;
import java.util.stream.Collectors;

public class LeetCode874_RobotWalk {


    public static void main(String[] args) {
        LeetCode874_RobotWalk solution = new LeetCode874_RobotWalk();
        System.out.println(solution.robotSim(new int[]{4, -1, 4, -2, 4}, new int[][]{{2, 4}, {2, 1}, {1, 2}}));
    }

    public int robotSim(int[] commands, int[][] obstacles) {
        //directions N 0, E 1, S 2, W 3
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int[] currPos = {0, 0};
        int maxDistance = 0;
        int currDir = 0;
        Map<Integer, HashSet<Integer>> obstaclesMap = new HashMap<>();
        for (int[] obsacle : obstacles) {
            if(!obstaclesMap.containsKey(obsacle[0]))
                obstaclesMap.put(obsacle[0],new HashSet<>());
            obstaclesMap.get(obsacle[0]).add(obsacle[1]);
        }

        for (int command : commands) {
            if (command == -1) {
                //based on direction array
                currDir = (currDir + 1) % 4;
                continue;
            }
            if (command == -2) {
                //based on direction array
                currDir = (currDir - 1) ;
                if(currDir==-1) currDir=3;
                continue;
            }

            int[] direction = directions[currDir];
            for (int step = 0; step < command; step++) {
                int nextX=currPos[0]+direction[0];
                int nextY=currPos[1]+direction[1];
                if(obstaclesMap.containsKey(nextX) && obstaclesMap.get(nextX).contains(nextY)) break;
                currPos[0]=nextX;
                currPos[1]=nextY;
            }
            maxDistance = Math.max(maxDistance, ((currPos[0] * currPos[0]) + (currPos[1] * currPos[1])));
        }
        return maxDistance;
    }

}
