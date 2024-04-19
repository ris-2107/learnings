package com.ris.practise.designPatterns.strategyPattern.apr_19_a.StartegyUsage;

import com.ris.practise.designPatterns.strategyPattern.apr_19_a.Strategy.MathsSolution;

public class ProblemsBaseClass {

    MathsSolution strategy;

    public ProblemsBaseClass(MathsSolution strategy){
        this.strategy=strategy;
    }
    public void resolutionUsed(){
        strategy.timeTaken();
    }
}
