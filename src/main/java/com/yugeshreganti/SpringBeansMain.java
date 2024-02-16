package com.yugeshreganti;

import com.yugeshreganti.beans.Vehicle;
import com.yugeshreganti.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBeansMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Hyundai Kona");
        System.out.println("Vehicle name not in spring context is: " + vehicle.getName());


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("Vehicle from spring context is: " + applicationContext.getBean(Vehicle.class).getName());
        System.out.println("String from spring context is: " + applicationContext.getBean(String.class));
        System.out.println("Number from spring context is: " + applicationContext.getBean(Integer.class));

    }
}