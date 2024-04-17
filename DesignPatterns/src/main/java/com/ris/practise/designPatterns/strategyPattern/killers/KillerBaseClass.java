package com.ris.practise.designPatterns.strategyPattern.killers;

import com.ris.practise.designPatterns.strategyPattern.killStrategies.KillStrategyInterface;

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
