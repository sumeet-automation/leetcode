package com.learning.graph.learning;

import java.util.Stack;

public class LeetCode200_NumberOfIslands {

    int rows;
    int columns;

    //Logic DFS for Graph
    public int numIslands(char[][] grid) {
        rows = grid.length;
        columns = grid[0].length;
        int islands = 0;
        boolean[][] visited = new boolean[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    dfs(i, j, grid, visited);
                    islands++;
                }
            }
        }
        return islands;
    }

    private void dfs(int row, int column, char[][] grid, boolean[][] visited) {
        if (row < 0 || row >= rows || column < 0 || column >= columns || grid[row][column] == '0' || visited[row][column]) {
            return;
        }
        visited[row][column] = true;
        int[][] adjList = {{row - 1, column}, //up
                {row, column + 1}, //right
                {row + 1, column}, //down
                {row, column - 1} //left
        };

        for (int[] neightbour : adjList) {
            dfs(neightbour[0], neightbour[1], grid, visited);
        }
    }


    public static void main(String[] args) {
        LeetCode200_NumberOfIslands solution = new LeetCode200_NumberOfIslands();
    }
}
