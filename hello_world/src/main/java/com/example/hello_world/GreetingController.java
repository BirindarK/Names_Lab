package com.example.hello_world;

import org.springframework.web.bind.annotation.RestController;

public class GreetingController {

    @RestController
    public String static class greeting(){
        return "Hello World!";
    }
}
