package com.ris.practise.designPatterns.strategyPattern.killers;

import com.ris.practise.designPatterns.strategyPattern.killStrategies.FastKillStrategy;

public class JohnWick extends KillerBaseClass {


    public JohnWick() {
        super(new FastKillStrategy());
    }


}
