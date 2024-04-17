package com.ris.practise.designPatterns.strategyPattern.killStrategies;


public class FastKillStrategy implements KillStrategy {
    @Override
    public void weaponUsed() {
        System.out.println("weapon used : AK-47");
    }

    @Override
    public void timeTaken() {
        System.out.println("time taken : 10 sec");
    }

    @Override
    public void selfDamagePercent() {
        System.out.println("self damage : 30%");
    }
}
