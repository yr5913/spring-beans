package com.yugeshreganti;

import com.yugeshreganti.beans.Vehicle;
import com.yugeshreganti.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBeansMain {
    public static void main(String[] args) {
        var applicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = applicationContext.getBean(Vehicle.class);
        System.out.println(vehicle);
        applicationContext.close();
    }
}