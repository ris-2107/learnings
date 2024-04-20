package com.ris.practise.designPatterns.StandardPatterns.DecoratorPattern.Cars;

public class KiaSeltos extends Car {
    private final long BASE_MODEL_COST = 1200000;

    @Override
    public long cost() {
        return BASE_MODEL_COST;
    }
}
