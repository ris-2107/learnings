package com.ris.learnings.designpatterns.StandardPatterns.StrategyPattern.Strategy;

public class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("NORMAL drive Strategy Implemented");
    }
}
