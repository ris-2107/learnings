package com.ris.practise.designPatterns.StandardPatterns.StrategyPattern.apr_18_2024_a;

import com.ris.practise.designPatterns.StandardPatterns.StrategyPattern.apr_18_2024_a.killers.Dracula;
import com.ris.practise.designPatterns.StandardPatterns.StrategyPattern.apr_18_2024_a.killers.JohnWick;
import com.ris.practise.designPatterns.StandardPatterns.StrategyPattern.apr_18_2024_a.killers.KillerBaseClass;
import com.ris.practise.designPatterns.StandardPatterns.StrategyPattern.apr_18_2024_a.killers.Thanos;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Runner {
    public static void main(String args[]){
        KillerBaseClass dracula= new Dracula();
        KillerBaseClass thanos = new Thanos();
        KillerBaseClass johnWick = new JohnWick();

        System.out.println("\ndracula: \n");
        dracula.killAction();
        System.out.println("\nthanos: \n");
        thanos.killAction();
        System.out.println("\njohn wick: \n");
        johnWick.killAction();
    }
}
