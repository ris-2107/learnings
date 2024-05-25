package com.ris.learnings.javaconcepts.multithreading.part2;

public class Main {

    public static void main(String args[]){

        System.out.println("Start Main: "+Thread.currentThread().getName());
        MultiThreadingLearning runnableObj=new MultiThreadingLearning();
        Thread thread= new Thread(runnableObj);
        thread.start();
        System.out.println("END Main: "+Thread.currentThread().getName());

    }
}
