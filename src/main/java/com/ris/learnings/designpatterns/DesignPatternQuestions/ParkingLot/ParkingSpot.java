package com.ris.learnings.designpatterns.DesignPatternQuestions.ParkingLot;

public class ParkingSpot {
    int id;
    boolean isEmpty;
    public Vehicle vehicle;
    int price;

    public ParkingSpot(int id, int price) {
        this.id = id;
        this.isEmpty = true;
        this.vehicle = null;
        this.price = price;
    }

    public void parkVehicle(Vehicle v) {
        this.vehicle = v;
        this.isEmpty = false;
    }

    public void removeVehicle() {
        this.vehicle = null;
        this.isEmpty = true;
    }

}
