package com.ris.practise.designPatterns.strategyPattern.killStrategies;

public class SlowKillStrategy implements KillStrategy{
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
