package com.ris.learnings.dsa.graphs;

import java.util.*;

public class DFS {
  public static void main(String[] args) {
    HashSet<Integer> visited = new HashSet<>();
    Map<Integer, List<Integer>> graph = new HashMap<>();
    graph.put(0, Arrays.asList(1, 2));
    graph.put(1, Arrays.asList(0, 3, 4));
    graph.put(2, Arrays.asList(0));
    graph.put(3, Arrays.asList(1));
    graph.put(4, Arrays.asList(1, 5));
    graph.put(5, Arrays.asList(4));


    // Perform BFS
    dfs(graph.keySet().iterator().next(), graph, visited);
  }

  private static void dfs(
      int node, Map<Integer, List<Integer>> graph, HashSet<Integer> visited) {
    System.out.println(node);
    visited.add(node);

    for (Integer neighbour : graph.get(node)) {
      if (!visited.contains(neighbour)) {
        dfs(neighbour, graph, visited);
      }
    }
  }
}
