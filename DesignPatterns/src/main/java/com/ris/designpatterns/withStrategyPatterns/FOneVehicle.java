package com.ris.designpatterns.withStrategyPatterns;

import com.ris.designpatterns.withStrategyPatterns.Strategy.SportsDriveStrategy;

public class FOneVehicle extends Vehicle {
    FOneVehicle() {
        super(new SportsDriveStrategy());
    }
}
