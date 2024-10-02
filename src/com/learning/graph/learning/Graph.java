package com.learning.graph.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Graph {

    private int[][] adjMatrix;
    private List<List<Integer>> adjList;

    public Graph(int nodes) {
        adjMatrix = new int[nodes][nodes];
        adjList = new ArrayList<>();
        for (int i = 0; i < nodes; i++){
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdgesInMatrix(int[][] edges, boolean isDirected) {
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            //directed
            if (isDirected) {
                adjMatrix[u][v] = 1;
                adjMatrix[v][u] = 1;
            } else {
                adjMatrix[u][v] = 1;
            }
        }
    }

    public void addEdgesInList(int[][] edges, boolean isDirected) {
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            //directed
            if (isDirected) {
                adjList.get(u).add(v);
                adjList.get(v).add(u);
            } else {
                adjList.get(u).add(v);
            }
        }
    }

    public void addWeightedEdgesInMatrix(int[][] edges, boolean isDirected) {
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            //directed
            if (isDirected) {
                adjMatrix[u][v] = w;
                adjMatrix[v][u] = w;
            } else {
                adjMatrix[u][v] = w;
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < adjMatrix.length; i++) {
            System.out.print("row " + i + " ---> ");
            for (int j = 0; j < adjMatrix[i].length; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public void printList() {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.print(i + " ---> ");
            System.out.print("[");
            for (int j = 0; j < adjList.get(i).size(); j++) {
                System.out.print(adjList.get(i).get(j)+", ");
            }
            System.out.print("]");
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        int[][] edges = {{0, 1}, {0, 2}, {1, 3}};
        Graph graph = new Graph(4);
        graph.addEdgesInMatrix(edges, true);
        System.out.println(Arrays.deepToString(graph.adjMatrix));
        graph.printMatrix();

        int[][] wightedEdges = {{0, 1, 10}, {0, 2, 20}, {1, 3, 40}};
        Graph weightedGraph = new Graph(4);
        weightedGraph.addWeightedEdgesInMatrix(wightedEdges, true);
        System.out.println(Arrays.deepToString(weightedGraph.adjMatrix));
        weightedGraph.printMatrix();

        int[][] edgesList = {{0, 1}, {0, 2}, {1, 3}};
        Graph edgesListGraph = new Graph(4);
        edgesListGraph.addEdgesInList(edgesList, true);
        System.out.println(edgesListGraph.adjList);
        edgesListGraph.printList();
    }
}
