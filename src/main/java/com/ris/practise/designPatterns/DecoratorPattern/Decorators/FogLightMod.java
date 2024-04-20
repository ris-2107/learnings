package com.ris.practise.designPatterns.DecoratorPattern.Decorators;

import com.ris.practise.designPatterns.DecoratorPattern.Cars.BaseModel;

public class FogLightMod extends BaseModsDecorator {
    private final long FOG_LIGHT_COST = 20000;
    BaseModel baseModel;

    public FogLightMod(BaseModel model) {
        this.baseModel = model;
    }

    @Override
    long modCost() {
        return baseModel.cost() + FOG_LIGHT_COST;
    }
}
