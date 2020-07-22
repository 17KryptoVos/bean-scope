package com.kryptovos;

import com.kryptovos.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {

        // Load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // Retrieve bean from the spring container

        Coach theCoach = context.getBean("myCoach", Coach.class);
        System.out.println(theCoach.getDailyWorkout());

        Coach alphaCoach = context.getBean("myCoach", Coach.class);
        System.out.println(theCoach.getDailyWorkout());

    }
}
