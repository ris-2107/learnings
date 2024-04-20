package com.ris.learnings.designpatterns.StandardPatterns.StrategyPattern;

import com.ris.learnings.designpatterns.StandardPatterns.StrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
