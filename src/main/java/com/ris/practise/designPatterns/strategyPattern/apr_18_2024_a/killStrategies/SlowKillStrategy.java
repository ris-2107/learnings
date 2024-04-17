package com.ris.practise.designPatterns.strategyPattern.apr_18_2024_a.killStrategies;

public class SlowKillStrategy implements KillStrategyInterface {
    @Override
    public void weaponUsed() {
        System.out.println("weapon used: Knife");
    }

    @Override
    public void timeTaken() {
        System.out.println("time taken : 30 min");
    }

    @Override
    public void selfDamagePercent() {
        System.out.println("self damage: 60%");
    }
}
