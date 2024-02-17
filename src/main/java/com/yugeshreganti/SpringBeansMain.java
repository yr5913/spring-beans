package com.yugeshreganti;

import com.yugeshreganti.beans.Person;
import com.yugeshreganti.beans.Vehicle;
import com.yugeshreganti.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBeansMain {
    public static void main(String[] args) {
        var applicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = applicationContext.getBean(Person.class);
       // Vehicle vehicle = applicationContext.getBean(Vehicle.class);
        System.out.println("Person details are: " + person);
        //System.out.println("Vehicle details are: " + vehicle);
    }
}