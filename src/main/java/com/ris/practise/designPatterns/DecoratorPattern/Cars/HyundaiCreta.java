package com.ris.practise.designPatterns.DecoratorPattern.Cars;

public class HyundaiCreta extends BaseModel {
    private final long BASE_MODEL_COST = 1450000;

    @Override
    public long cost() {
        return BASE_MODEL_COST;
    }
}
