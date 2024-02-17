# SpringBeans

This project works on different techniques of creating Spring Beans and autowiring them. Please look through the commit
history section below for changes in each iteration. Each iteration shows different types of creating beans and working
with them

## Table of Contents

- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Commit History](#commit-history)

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) 17 or later
- [Spring](https://spring.io/projects/spring-boot) framework
- Maven for building the project

## Getting Started

Follow these steps to set up and run the Spring security Learner Microservice:

1. Clone this repository:

   ```shell
   git clone https://github.com/yr5913/spring-beans.git
   cd spring-beans
2. Build the microservice:
   ```shell
   mvn clean install

3. Run the microservice:
   ```shell
   java -jar target/spring-beans.jar

## Commit History

1. Usage of @Beans Annotation -- First commit created spring beans
2. generates NoUniqueBeanDefinitionException due to ambiguity as multiple beans of same class are created
3. corrected NoUniqueBeanDefinitionException by specifying the proper name of the bean to avoid ambiguity
4. Usage of property name, value in the @Bean Annotation - How to provide user defined names to beans
5. usage of @Primary annotation to specify the default bean to the spring
6. Usage of @Component Annotation
7. Usage of @PostConstruct Annotation
8. Usage of @PreDestroy Annotation
9. Usage of registerBean() Method
10. Created Two different types of beans that has a relationship between them but didn't autowire them
11. Autowired beans using method call
12. Autowired beans using method parameters
13. Autowired using @Autowired annotation on class fields
14. Usage of @Autowired annotation with its parameter required set to false
15. Autowired using @Autowired annotation on setter method
16. Autowired without using @Autowired annotation anywhere -- by default spring does the constructor autowiring if there
    is only one constructor
17. Autowired using @Autowired annotation on constructor -- best practice
18. Multiple beans, using @Autowired annotation on constructor where the parameter name doesn't match with any of
    the multiple beans -Error UnsatisfiedDependencyException


