package com.ris.learnings.designpatterns.DesignPatternQuestions.ParkingLot.ParkingSpots;

import java.util.List;

import com.ris.learnings.designpatterns.DesignPatternQuestions.ParkingLot.ParkingSpot;
import com.ris.learnings.designpatterns.DesignPatternQuestions.ParkingLot.Vehicle;

public abstract class ParkingSpotManager {
    List<ParkingSpot> spots;

    ParkingSpotManager(List<ParkingSpot> spots) {
        this.spots = spots;
    }

    public abstract ParkingSpot findParkingSpace();

    public void parkVehicle(Vehicle v) {
        ParkingSpot spot = findParkingSpace();
        spot.parkVehicle(v);
    }

    public void removeVehicle(Vehicle v) {
        for (ParkingSpot spot : spots) {
            if (spot.vehicle != null && spot.vehicle.equals(v)) {
                spot.removeVehicle();
                break;
            }

        }
    }

}
