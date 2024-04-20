package com.ris.learnings.designpatterns.StandardPatterns.StrategyPattern;

import com.ris.learnings.designpatterns.StandardPatterns.StrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    // Constructor Injection
    Vehicle(DriveStrategy strategy){
        this.driveStrategy=strategy;
    }
    public void drive(){
        driveStrategy.drive();
    }
}
