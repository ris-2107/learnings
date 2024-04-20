package com.ris.practise.designPatterns.StandardPatterns.DecoratorPattern.Cars;

public class HyundaiCreta extends Car {
    private final long BASE_MODEL_COST = 1450000;

    @Override
    public long cost() {
        return BASE_MODEL_COST;
    }
}
