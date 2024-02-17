package com.yugeshreganti;

import com.yugeshreganti.beans.VehicleServices;
import com.yugeshreganti.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBeansMain {
    public static void main(String[] args) {
        var applicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices vehicleServices = applicationContext.getBean(VehicleServices.class);
        VehicleServices vehicleServices2 = applicationContext.getBean("vehicleServices", VehicleServices.class);
        System.out.println("Hash of vehicleService 1 : " + vehicleServices.hashCode());
        System.out.println("Hash of vehicleService 2 : " + vehicleServices2.hashCode());
        if (vehicleServices2 == vehicleServices) {
            System.out.println("Both Services are Same");
        }
    }
}