package com.ris.designpatterns.withStrategyPatterns;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

    public static void main(String[] args) {
        Vehicle vehicle=new NormalVehicle();
        Vehicle sportsVehicle=new SportsVehicle();
        vehicle.drive();
        sportsVehicle.drive();
    }

}
