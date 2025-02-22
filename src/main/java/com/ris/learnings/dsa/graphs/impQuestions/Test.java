package com.ris.learnings.dsa.graphs.impQuestions;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Slf4j
public class Test {
    public static void main(String[] args) {
        HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();
        graph.put(1, new ArrayList<>(Arrays.asList(2, 3)));
        graph.put(2, new ArrayList<>(Arrays.asList(4, 5)));
        graph.put(3, new ArrayList<>(List.of(6)));
        graph.put(4, new ArrayList<>());
        graph.put(5, new ArrayList<>());
        graph.put(6, new ArrayList<>());

        log.info(graph.toString());

    }
}