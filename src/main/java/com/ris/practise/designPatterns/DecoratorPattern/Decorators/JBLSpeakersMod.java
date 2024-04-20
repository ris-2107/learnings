package com.ris.practise.designPatterns.DecoratorPattern.Decorators;

import com.ris.practise.designPatterns.DecoratorPattern.Cars.BaseModel;

public class JBLSpeakersMod extends BaseModel {

    private final long JBL_SPEAKER_COST = 50000;
    BaseModel baseModel;

    public JBLSpeakersMod(BaseModel baseModel) {
        this.baseModel = baseModel;
    }

    @Override
    public long cost() {
        return baseModel.cost() + JBL_SPEAKER_COST;
    }
}
