package com.ris.practise.designPatterns.StandardPatterns.StrategyPattern.apr_18_2024_a.killers;

import com.ris.practise.designPatterns.StandardPatterns.StrategyPattern.apr_18_2024_a.killStrategies.SlowKillStrategy;

public class Dracula extends KillerBaseClass {
    public Dracula() {
        super(new SlowKillStrategy());
    }
}
