package com.springframework.sfgdi.services.greetingService;

public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - PRIMARY";
    }
}
