package com.yugeshreganti.config;


import com.yugeshreganti.beans.Person;
import com.yugeshreganti.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Lambo");
        return vehicle;
    }

    @Bean
    public Person person() {
        Person person = new Person();
        person.setName("Yugesh");
        person.setVehicle(vehicle());
        return person;
    }

}
