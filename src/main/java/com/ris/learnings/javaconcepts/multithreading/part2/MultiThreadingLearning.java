package com.ris.learnings.javaconcepts.multithreading.part2;

public class MultiThreadingLearning implements Runnable {

    @Override
    public void run() {
        System.out.println("RUN executed "+Thread.currentThread().getName());
    }
}




