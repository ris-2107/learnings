package com.ris.practise.designPatterns.StandardPatterns.StrategyPattern.apr_18_2024_b.Games;

import com.ris.practise.designPatterns.StandardPatterns.StrategyPattern.apr_18_2024_b.PlayStrategies.Football;

public class Fifa extends BaseGameClass{
    public Fifa() {
        super(new Football(), "Footbal is Soccer");
    }
}
