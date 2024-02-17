package com.yugeshreganti.beans;


import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name = "Yugesh";

    private Vehicle vehicle;

    public Person(Vehicle vehicle) {
        this.vehicle = vehicle;
        System.out.println("Created a Person by Spring");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", vehicle=" + vehicle +
                '}';
    }
}
