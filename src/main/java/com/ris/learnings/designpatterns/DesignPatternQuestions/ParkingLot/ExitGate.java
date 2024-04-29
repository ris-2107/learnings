package com.ris.learnings.designpatterns.DesignPatternQuestions.ParkingLot;

import java.util.ArrayList;

import com.ris.learnings.designpatterns.DesignPatternQuestions.ParkingLot.ParkingSpots.ParkingSpotManager;
import com.ris.learnings.designpatterns.DesignPatternQuestions.ParkingLot.ParkingSpots.ParkingSpotManagerFactory;

public class ExitGate {
    ParkingSpotManagerFactory factory;

    public ExitGate(ParkingSpotManagerFactory factory) {
        this.factory = factory;
    }

    public void removeVehicle(Ticket ticket) {
        System.out.println((System.nanoTime() - ticket.entryTime) * ticket.parkingSpot.price);
        ParkingSpotManager manager = factory.getParkingSpotManager(ticket.vehicle.vehicleType, new ArrayList<>());
        manager.removeVehicle(ticket.vehicle);
    }
}