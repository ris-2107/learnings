package com.ris.learnings.designpatterns.withStrategyPatterns;

import com.ris.learnings.designpatterns.withStrategyPatterns.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
