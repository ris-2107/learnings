package com.ris.practise.designPatterns.strategyPattern.apr_18_2024_a.killers;

import com.ris.practise.designPatterns.strategyPattern.apr_18_2024_a.killStrategies.KillStrategyInterface;

public class KillerBaseClass {
    KillStrategyInterface killStrategyInterface;

    KillerBaseClass(KillStrategyInterface killStrategyInterface){
        this.killStrategyInterface = killStrategyInterface;
    }

    public void killAction(){
        killStrategyInterface.weaponUsed();
        killStrategyInterface.timeTaken();
        killStrategyInterface.selfDamagePercent();
        System.out.println();
    }
}
