package com.ris.practise.designPatterns.strategyPattern.apr_18_2024_b.Games;

import com.ris.practise.designPatterns.strategyPattern.apr_18_2024_b.PlayStrategies.Cricket;
import com.ris.practise.designPatterns.strategyPattern.apr_18_2024_b.PlayStrategies.IPlayStrategy;

public class OneDayCricket extends BaseGameClass{
    public OneDayCricket() {
        super(new Cricket(), "Cricket is great");
    }
}
