package com.ris.designpatterns.withStrategyPatterns;

import com.ris.designpatterns.withStrategyPatterns.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
