package com.ris.learnings.designpatterns.StandardPatterns.StrategyPattern;

import com.ris.learnings.designpatterns.StandardPatterns.StrategyPattern.Strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle {
    NormalVehicle() {
        super(new NormalDriveStrategy());
    }
}
