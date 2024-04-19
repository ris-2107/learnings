package com.ris.practise.designPatterns.strategyPattern.apr_19_a.StartegyUsage;

import com.ris.practise.designPatterns.strategyPattern.apr_19_a.Strategy.DifferentiationStrategy;

public class GeneralProblems extends ProblemsBaseClass{
    GeneralProblems(){
        super(new DifferentiationStrategy());
    }
}
