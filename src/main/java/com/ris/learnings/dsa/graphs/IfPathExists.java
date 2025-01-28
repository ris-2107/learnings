package com.ris.learnings.dsa.graphs;

import java.util.*;

public class IfPathExists {
  public static void main(String[] args) {
    List<List<Integer>> edges = new ArrayList<>();
    edges.add(Arrays.asList(0, 1));
    edges.add(Arrays.asList(0, 2));
    edges.add(Arrays.asList(1, 3));
    edges.add(Arrays.asList(1, 4));
    edges.add(Arrays.asList(2, 5));
    edges.add(Arrays.asList(4, 6));

    HashSet<Integer> visited = new HashSet<>();
    Map<Integer, List<Integer>> graph = new HashMap<>();
    int src = 0;
    int dest = 6;
    for (int i = 0; i < edges.size(); i++) {
      int a = edges.get(i).get(0);
      int b = edges.get(i).get(1);
      List<Integer> connections = graph.get(a);
      if (null == connections) {
        connections = new ArrayList<>();
      }
      connections.add(b);
      graph.put(a, connections);
    }
    final boolean solve = solve(graph, src, dest, visited);
    System.out.println("ANS " + solve);
  }

  private static boolean solve(
      Map<Integer, List<Integer>> graph, int src, int dest, HashSet<Integer> visited) {
    Queue<Integer> q = new LinkedList<>();
    q.add(src);
    visited.add(src);
    while (!q.isEmpty()) {
      final Integer polled = q.poll();
      final List<Integer> connections = graph.get(polled);
      if (connections != null) {
        for (Integer connection : connections) {
          if (connection == dest) return true;
          if (visited.contains(dest)) return true;
          if (!visited.contains(connection)) {
            q.add(connection);
            visited.add(connection);
          }
        }
      }
    }
    return false;
  }
}
