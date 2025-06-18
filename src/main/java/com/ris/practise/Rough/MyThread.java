package com.ris.practise.Rough;

public class MyThread extends Thread {

    @Override
    public void run() {

    }

    public static void main(String[] args) {
        Thread thread = new MyThread();
        System.out.println(thread.getName());
        System.out.println(thread.getState());
        System.out.println(Thread.currentThread().getName());
    }
}
