package com.ris.learnings.designpatterns.withStrategyPatterns.Strategy;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("SPORTS Drive Strategy implemented");
    }
}
