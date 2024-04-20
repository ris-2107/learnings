package com.ris.practise.designPatterns.DecoratorPattern.Cars;

public class TataNexon extends BaseModel {
    private final long BASE_MODEL_COST = 1100000;

    @Override
    public long cost() {
        return BASE_MODEL_COST;
    }
}
