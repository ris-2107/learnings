package com.ris.learnings.designpatterns.DesignPatternQuestions.ParkingLot.ParkingSpots;

import java.util.List;

import com.ris.learnings.designpatterns.DesignPatternQuestions.ParkingLot.ParkingSpot;

class TwoWheelerParkingManager extends ParkingSpotManager {
    TwoWheelerParkingManager(List<ParkingSpot> spots) {
        super(spots);
    }

    @Override
    public ParkingSpot findParkingSpace() {
        for (ParkingSpot spot : spots) {
            if (spot.isEmpty) { // Check if the spot is empty
                return spot; // Return the first available parking spot
            }
        }
        // Implementation to find nearest parking spot for Two Wheelers
        return null;
    }

}