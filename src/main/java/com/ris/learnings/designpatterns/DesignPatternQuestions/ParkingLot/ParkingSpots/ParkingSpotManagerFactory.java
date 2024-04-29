package com.ris.learnings.designpatterns.DesignPatternQuestions.ParkingLot.ParkingSpots;

import java.util.List;

import com.ris.learnings.designpatterns.DesignPatternQuestions.ParkingLot.ParkingSpot;
import com.ris.learnings.designpatterns.DesignPatternQuestions.ParkingLot.Enums.VehicleType;

public class ParkingSpotManagerFactory {
    public ParkingSpotManager getParkingSpotManager(VehicleType vehicleType, List<ParkingSpot> spots) {
        if (vehicleType == VehicleType.TWO_WHEELER)
            return new TwoWheelerParkingManager(spots);
        else if (vehicleType == VehicleType.FOUR_WHEELER)
            return new FourWheelerManager(spots);
        else
            return null; // Handle error
    }
}
