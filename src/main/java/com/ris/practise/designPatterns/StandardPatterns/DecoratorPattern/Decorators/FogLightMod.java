package com.ris.practise.designPatterns.StandardPatterns.DecoratorPattern.Decorators;

import com.ris.practise.designPatterns.StandardPatterns.DecoratorPattern.Cars.Car;

public class FogLightMod extends BaseModsDecorator {
    private final long FOG_LIGHT_COST = 20000;
    Car car;

    public FogLightMod(Car model) {
        this.car = model;
    }

    @Override
    public long cost() {
        return car.cost() + FOG_LIGHT_COST;
    }
}
