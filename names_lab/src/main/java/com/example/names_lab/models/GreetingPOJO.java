package com.example.names_lab.models;

public class GreetingPOJO {
    private String name;
    private String timeOfDay;


    public GreetingPOJO(String name, String timeOfDay){
        this.name = name;
        this.timeOfDay =  timeOfDay;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }
}
