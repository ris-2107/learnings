package com.ris.practise.designPatterns.strategyPattern.apr_19_a.StartegyUsage;

import com.ris.practise.designPatterns.strategyPattern.apr_19_a.Strategy.IntegrationStrategy;

public class NewtonianProblems extends ProblemsBaseClass {

    public NewtonianProblems() {
        super(new IntegrationStrategy());
    }
}
