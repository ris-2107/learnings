package com.ris.designpatterns.withStrategyPatterns.Strategy;

public class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("NORMAL drive Strategy Implemented");
    }
}
