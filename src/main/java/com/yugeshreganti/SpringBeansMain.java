package com.yugeshreganti;

import com.yugeshreganti.beans.Person;
import com.yugeshreganti.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBeansMain {
    public static void main(String[] args) {
        var applicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Before Getting the person bean from context");
        Person person = applicationContext.getBean(Person.class);
        System.out.println("After Getting the person bean from context");
    }
}