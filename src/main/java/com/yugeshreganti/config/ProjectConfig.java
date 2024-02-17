package com.yugeshreganti.config;


import com.yugeshreganti.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.yugeshreganti.beans")
public class ProjectConfig {
    @Bean
    @Primary
    Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("Lambo");
        return veh;
    }

    @Bean
    Vehicle vehicle2() {
        var veh = new Vehicle();
        veh.setName("Camry");
        return veh;
    }

    @Bean
    Vehicle vehicle3() {
        var veh = new Vehicle();
        veh.setName("Kona");
        return veh;
    }

}
