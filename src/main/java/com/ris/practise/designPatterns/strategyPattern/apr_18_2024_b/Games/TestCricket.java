package com.ris.practise.designPatterns.strategyPattern.apr_18_2024_b.Games;

import com.ris.practise.designPatterns.strategyPattern.apr_18_2024_b.PlayStrategies.Cricket;

public class TestCricket extends BaseGameClass{
    public TestCricket() {
        super(new Cricket(),"TEST cricket is boring");
    }
}
