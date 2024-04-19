package com.ris.practise.designPatterns.strategyPattern.apr_19_a.StartegyUsage;

public class RunnerClass {
    public static void main(String args[]){
        NewtonianProblems newtonianProblems=new NewtonianProblems();
        GeneralProblems generalProblems= new GeneralProblems();

        newtonianProblems.resolutionUsed();
        generalProblems.resolutionUsed();
    }
}
