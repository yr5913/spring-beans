package com.yugeshreganti.config;


import com.yugeshreganti.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    Vehicle vehicle1() {
        var vehicle = new Vehicle();
        vehicle.setName("Toyota Camry");
        return vehicle;
    }

    @Bean
    Vehicle vehicle2() {
        var vehicle = new Vehicle();
        vehicle.setName("Lambo");
        return vehicle;
    }


    @Bean
    Vehicle vehicle3() {
        var vehicle = new Vehicle();
        vehicle.setName("Hyundai Kona");
        return vehicle;
    }


}
