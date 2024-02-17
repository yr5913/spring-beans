package com.yugeshreganti.beans;


import org.springframework.beans.factory.annotation.Autowired;

public class Vehicle {

    private String name;

    @Autowired
    private Person person;

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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
