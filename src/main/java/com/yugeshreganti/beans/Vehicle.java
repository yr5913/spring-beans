package com.yugeshreganti.beans;


import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name = "Lambo";

    public Vehicle() {
        System.out.println("Vehicle created by Spring");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
