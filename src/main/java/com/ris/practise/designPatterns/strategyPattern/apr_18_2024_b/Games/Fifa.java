package com.ris.practise.designPatterns.strategyPattern.apr_18_2024_b.Games;

import com.ris.practise.designPatterns.strategyPattern.apr_18_2024_b.PlayStrategies.Football;
import com.ris.practise.designPatterns.strategyPattern.apr_18_2024_b.PlayStrategies.IPlayStrategy;

public class Fifa extends BaseGameClass{
    public Fifa() {
        super(new Football(), "Footbal is Soccer");
    }
}
