package com.ris.learnings.designpatterns.StandardPatterns.StrategyPattern;

import com.ris.learnings.designpatterns.StandardPatterns.StrategyPattern.Strategy.SportsDriveStrategy;

public class FOneVehicle extends Vehicle {
    FOneVehicle() {
        super(new SportsDriveStrategy());
    }
}
