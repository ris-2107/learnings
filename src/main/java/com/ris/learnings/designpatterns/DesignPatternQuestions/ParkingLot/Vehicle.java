package com.ris.learnings.designpatterns.DesignPatternQuestions.ParkingLot;

import com.ris.learnings.designpatterns.DesignPatternQuestions.ParkingLot.Enums.VehicleType;

public class Vehicle {
    int VehicleNo;
    VehicleType vehicleType;
    public Vehicle(int vehicleNo, VehicleType vehicleType) {
        VehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
    }
    public int getVehicleNo() {
        return VehicleNo;
    }
    public VehicleType getVehicleType() {
        return vehicleType;
    }
    
}
