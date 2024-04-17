package com.ris.designpatterns.withStrategyPatterns;

import com.ris.designpatterns.withStrategyPatterns.Strategy.DriveStrategy;

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
