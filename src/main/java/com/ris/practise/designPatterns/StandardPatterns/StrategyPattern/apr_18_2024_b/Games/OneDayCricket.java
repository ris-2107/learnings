package com.ris.practise.designPatterns.StandardPatterns.StrategyPattern.apr_18_2024_b.Games;

import com.ris.practise.designPatterns.StandardPatterns.StrategyPattern.apr_18_2024_b.PlayStrategies.Cricket;

public class OneDayCricket extends BaseGameClass{
    public OneDayCricket() {
        super(new Cricket(), "Cricket is great");
    }
}
