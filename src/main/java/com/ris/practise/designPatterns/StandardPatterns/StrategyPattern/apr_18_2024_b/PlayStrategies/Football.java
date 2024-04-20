package com.ris.practise.designPatterns.StandardPatterns.StrategyPattern.apr_18_2024_b.PlayStrategies;

public class Football implements IPlayStrategy{
    @Override
    public void playTime() {
        System.out.println("PLAY TIME : 1.5 hrs");
    }

    @Override
    public void playerCount() {
        System.out.println("PLAYER # : 10");
    }
}
