package com.ris.practise.designPatterns.strategyPattern.apr_18_2024_a.killers;

import com.ris.practise.designPatterns.strategyPattern.apr_18_2024_a.killStrategies.FastKillStrategy;

public class JohnWick extends KillerBaseClass {


    public JohnWick() {
        super(new FastKillStrategy());
    }


}