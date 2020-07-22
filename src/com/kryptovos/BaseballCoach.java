package com.kryptovos;

public class BaseballCoach implements Coach {
    // Define private field for the dependecy
    private FortuneService fortuneService;

    // No arg constructor
    public BaseballCoach() {
    }

    // Define constructor for dependecy injection
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {

        return "Spend 30 minutes in the cage";
    }

    @Override
    public String getDailyFortune() {

        // Use my fortuneService to get a fortune
        return fortuneService.getFortune();

    }

    // Add init method
    public  void doMyStartUpStuff(){
        System.out.println("BaseballCoach: Inside methode doMyStartUpStuff");
    }

    // Add destroy method
    public  void doMyCleanUpStuff(){
        System.out.println("BaseballCoach: Inside methode doMyCleanUpStuff");
    }
}
