package com.ris.practise.designPatterns.strategyPattern.killers;

import com.ris.practise.designPatterns.strategyPattern.killStrategies.FastKillStrategy;

public class Thanos extends KillerBaseClass {
    public Thanos() {
        super(new FastKillStrategy());
    }
}
