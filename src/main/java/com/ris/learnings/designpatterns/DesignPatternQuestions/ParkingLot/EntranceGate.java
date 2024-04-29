package com.ris.learnings.designpatterns.DesignPatternQuestions.ParkingLot;

import java.util.List;

import com.ris.learnings.designpatterns.DesignPatternQuestions.ParkingLot.Enums.VehicleType;
import com.ris.learnings.designpatterns.DesignPatternQuestions.ParkingLot.ParkingSpots.ParkingSpotManager;
import com.ris.learnings.designpatterns.DesignPatternQuestions.ParkingLot.ParkingSpots.ParkingSpotManagerFactory;

public class EntranceGate {
    ParkingSpotManagerFactory factory;

    public EntranceGate(ParkingSpotManagerFactory factory) {
        this.factory = factory;
    }

    public ParkingSpot findParkingSpace(VehicleType vehicleType, List<ParkingSpot> spots) {
        ParkingSpotManager manager = factory.getParkingSpotManager(vehicleType, spots);
        return manager.findParkingSpace();
    }

    public Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        // Implementation to generate ticket
        Ticket tkt = new Ticket(System.currentTimeMillis(), parkingSpot, vehicle);
        return tkt;
    }

}