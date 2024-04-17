package com.ris.practise.designPatterns.strategyPattern.apr_18_2024_a.killers;

import com.ris.practise.designPatterns.strategyPattern.apr_18_2024_a.killStrategies.FastKillStrategy;

public class Thanos extends KillerBaseClass {
    public Thanos() {
        super(new FastKillStrategy());
    }
}
