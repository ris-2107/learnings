package com.ris.learnings.dsa.graphs;

import java.util.*;

public class BFS {
  public static void main(String[] args) {
    HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();
    graph.put(1, new ArrayList<>(Arrays.asList(2, 3)));
    graph.put(2, new ArrayList<>(Arrays.asList(4, 5)));
    graph.put(3, new ArrayList<>(List.of(6)));
    graph.put(4, new ArrayList<>());
    graph.put(5, new ArrayList<>());
    graph.put(6, new ArrayList<>());

    // Perform BFS
    bfs(graph);
  }

  private static void bfs(HashMap<Integer, ArrayList<Integer>> graph) {
    if (graph.isEmpty()) System.err.println("Empty Graph");
    Queue<Integer> q = new LinkedList<>();
    HashSet<Integer> visited = new HashSet<>();
    final Integer firstEle = graph.keySet().iterator().next();
    q.add(firstEle);
    visited.add(firstEle);

    while (!q.isEmpty()) {
      final Integer polledEle = q.poll();
      System.out.println(polledEle);
      visited.add(polledEle);
      for (Integer nbr : graph.get(polledEle)) {
        if (!visited.contains(nbr)) {
          q.add(nbr);
        }
      }
    }
  }
}
