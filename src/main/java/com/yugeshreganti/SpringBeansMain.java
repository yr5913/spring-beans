package com.yugeshreganti;

import com.yugeshreganti.beans.VehicleServices;
import com.yugeshreganti.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBeansMain {
    public static void main(String[] args) {
        var applicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices vehicleServices = applicationContext.getBean(VehicleServices.class);
        VehicleServices vehicleServices1 = applicationContext.getBean(VehicleServices.class);
        System.out.println("Hash of Vehicle Service 1: " + vehicleServices.hashCode());
        System.out.println("Hash of Vehicle Service 2: " + vehicleServices1.hashCode());
        if (vehicleServices1 != vehicleServices) {
            System.out.println("Both are not equal");
        }
    }
}