package com.ris.practise.designPatterns.strategyPattern.apr_18_2024_b.PlayStrategies;

public class Cricket implements IPlayStrategy{
    @Override
    public void playTime() {
        System.out.println("PLAY TIME : 3hrs");
    }

    @Override
    public void playerCount() {
        System.out.println("PLAYER # : 11");
    }
}
