package com.ris.learnings.designpatterns.withStrategyPatterns;

import com.ris.learnings.designpatterns.withStrategyPatterns.Strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle {
    NormalVehicle() {
        super(new NormalDriveStrategy());
    }
}
