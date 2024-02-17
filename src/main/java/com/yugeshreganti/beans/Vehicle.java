package com.yugeshreganti.beans;


import org.springframework.beans.factory.annotation.Autowired;

public class Vehicle {

    private String name;

    @Autowired
    private VehicleServices vehicleServices;

    public Vehicle() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleServices getVehicleServices() {
        return vehicleServices;
    }

    public void setVehicleServices(VehicleServices vehicleServices) {
        this.vehicleServices = vehicleServices;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", vehicleServices=" + vehicleServices +
                '}';
    }
}
