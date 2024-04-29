package com.ris.learnings.designpatterns.DesignPatternQuestions.ParkingLot.Runner;

import java.util.ArrayList;
import java.util.List;

import com.ris.learnings.designpatterns.DesignPatternQuestions.ParkingLot.EntranceGate;
import com.ris.learnings.designpatterns.DesignPatternQuestions.ParkingLot.ExitGate;
import com.ris.learnings.designpatterns.DesignPatternQuestions.ParkingLot.ParkingSpot;
import com.ris.learnings.designpatterns.DesignPatternQuestions.ParkingLot.Ticket;
import com.ris.learnings.designpatterns.DesignPatternQuestions.ParkingLot.Vehicle;
import com.ris.learnings.designpatterns.DesignPatternQuestions.ParkingLot.Enums.VehicleType;
import com.ris.learnings.designpatterns.DesignPatternQuestions.ParkingLot.ParkingSpots.ParkingSpotManagerFactory;

public class Runner {
    public static void main(String[] args) {
        // Initialize parking spots
        List<ParkingSpot> spots = new ArrayList<>();
        for (int i = 1; i <= 100; ++i) {
            if (i <= 50)
                spots.add(new ParkingSpot(i, 10));
            else
                spots.add(new ParkingSpot(i, 20));
        }

        // Create ParkingSpotManagerFactory
        ParkingSpotManagerFactory factory = new ParkingSpotManagerFactory();

        // Create EntranceGate and ExitGate objects
        EntranceGate entranceGate = new EntranceGate(factory);
        ExitGate exitGate = new ExitGate(factory);

        // Example usage
        Vehicle vehicle = new Vehicle(123, VehicleType.TWO_WHEELER);
        ParkingSpot spot = entranceGate.findParkingSpace(vehicle.getVehicleType(), spots);
        Ticket ticket = entranceGate.generateTicket(vehicle, spot);

        // Vehicle leaves
        exitGate.removeVehicle(ticket);
    }
}
