package com.yugeshreganti;

import com.yugeshreganti.beans.Vehicle;
import com.yugeshreganti.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class SpringBeansMain {
    public static void main(String[] args) {
        var applicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle lambo = new Vehicle();
        lambo.setName("Lamborghini");
        Supplier<Vehicle> lamboSupplier = () -> lambo;
        Supplier<Vehicle> konaSupplier = () -> {
            Vehicle vehicle1 = new Vehicle();
            vehicle1.setName("Hyundai Kona");
            return vehicle1;
        };
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        if (randomNumber % 2 == 0) {
            applicationContext.registerBean("lambo", Vehicle.class, lamboSupplier);
        } else {
            applicationContext.registerBean("kona", Vehicle.class, konaSupplier);

        }
        System.out.println("Random Number: " + randomNumber);
        Vehicle lamboVehicle = null;
        Vehicle konaVehicle = null;
        try {
            lamboVehicle = applicationContext.getBean("lambo", Vehicle.class);
        } catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            System.out.println("Error while creating lambo vehicle");
        }
        try {
            konaVehicle = applicationContext.getBean("kona", Vehicle.class);
        } catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            System.out.println("Error while creating kona vehicle");
        }

        if (null != lamboVehicle) {
            System.out.println("Programming Vehicle name from Spring Context is: " + lamboVehicle.getName());
        } else {
            System.out.println("Programming Vehicle name from Spring Context is: " + konaVehicle.getName());
        }


    }
}