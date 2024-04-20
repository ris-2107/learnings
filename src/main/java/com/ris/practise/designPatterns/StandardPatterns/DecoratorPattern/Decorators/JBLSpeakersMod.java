package com.ris.practise.designPatterns.StandardPatterns.DecoratorPattern.Decorators;

import com.ris.practise.designPatterns.StandardPatterns.DecoratorPattern.Cars.Car;

public class JBLSpeakersMod extends BaseModsDecorator {

    private final long JBL_SPEAKER_COST = 50000;
    Car car;

    public JBLSpeakersMod(Car car) {
        this.car = car;
    }

    @Override
    public long cost() {
        return car.cost() + JBL_SPEAKER_COST;
    }
}
