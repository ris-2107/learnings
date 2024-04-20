package com.ris.practise.designPatterns.DecoratorPattern.Cars;

public class KiaSeltos extends BaseModel {
    private final long BASE_MODEL_COST = 1200000;

    @Override
    public long cost() {
        return BASE_MODEL_COST;
    }
}
