package com.example.names_lab.controllers;

import com.example.names_lab.models.Celebration;
import com.example.names_lab.models.Greeting;
import com.example.names_lab.models.GreetingPOJO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping(value = "/greeting")

public class GreetingController {

//    @GetMapping
//    public String greeting(){
//        Greeting greeting = new Greeting("Colin");
//        return "Good Afternoon " + greeting.getName() + "!";
//
//    }

    @GetMapping
    public GreetingPOJO greetingPOJO(@RequestParam (required = false) String timeOfDay) {
        return new GreetingPOJO("Colin",timeOfDay);
    }
//    for this to work must place ?timeOfDay= "String" http://localhost:8080/greeting?timeOfDay=3pm

    @GetMapping(value = "/summer")
    public Celebration celebration(){
        return new Celebration("Happy Summer Solstice!");
    }

}
