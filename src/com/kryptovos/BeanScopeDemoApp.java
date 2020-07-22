package com.kryptovos;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {

        // Load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // Retrieve bean from the spring container

        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // Check if theCoach is the same instance as alphaCoach
        boolean result = theCoach == alphaCoach;
        System.out.println("\nPointing to the same object: " + result);

        // Memory locations
        System.out.println("\nMemory location for theCoach is: " + theCoach);
        System.out.println("\nMemory location for alphaCoach is: " + alphaCoach);

        // Close context
        context.close();
    }
}
