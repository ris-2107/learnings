package com.ris.learnings.designpatterns.withStrategyPatterns;

import com.ris.learnings.designpatterns.withStrategyPatterns.Strategy.SportsDriveStrategy;

public class FOneVehicle extends Vehicle {
    FOneVehicle() {
        super(new SportsDriveStrategy());
    }
}
