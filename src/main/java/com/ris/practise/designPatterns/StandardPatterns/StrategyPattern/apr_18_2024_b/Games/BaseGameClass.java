package com.ris.practise.designPatterns.StandardPatterns.StrategyPattern.apr_18_2024_b.Games;

import com.ris.practise.designPatterns.StandardPatterns.StrategyPattern.apr_18_2024_b.PlayStrategies.IPlayStrategy;

public class BaseGameClass {
    IPlayStrategy playStrategy;
    String msg;

    BaseGameClass(IPlayStrategy playStrategy, String msg) {
        this.playStrategy = playStrategy;
        this.msg = msg;
    }

    public void playTheGame() {
        System.out.println("MSG PASSED: " + msg);
        playStrategy.playTime();
        playStrategy.playerCount();
    }
}
