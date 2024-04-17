package com.ris.designpatterns.withStrategyPatterns;

import com.ris.designpatterns.withStrategyPatterns.Strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle {
    NormalVehicle() {
        super(new NormalDriveStrategy());
    }
}
