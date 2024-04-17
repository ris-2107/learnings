package com.ris.practise.designPatterns.strategyPattern.killers;

import com.ris.practise.designPatterns.strategyPattern.killStrategies.SlowKillStrategy;

public class Dracula extends KillerBaseClass {
    public Dracula() {
        super(new SlowKillStrategy());
    }
}
