package com.yugeshreganti.config;


import com.yugeshreganti.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    Vehicle vehicle() {
        var vehicle = new Vehicle();
        vehicle.setName("Toyota Camry");
        return vehicle;
    }

    @Bean
    String hello() {
        return "Hello Yugesh";
    }


    @Bean
    Integer age() {
        return 28;
    }


}
