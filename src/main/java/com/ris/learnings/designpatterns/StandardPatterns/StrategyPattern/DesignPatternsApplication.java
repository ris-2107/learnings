package com.ris.learnings.designpatterns.StandardPatterns.StrategyPattern;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

    public static void main(String[] args) {
        Vehicle normalVehicle=new NormalVehicle();
        Vehicle sportsVehicle=new SportsVehicle();
        normalVehicle.drive();
        sportsVehicle.drive();
    }

}
