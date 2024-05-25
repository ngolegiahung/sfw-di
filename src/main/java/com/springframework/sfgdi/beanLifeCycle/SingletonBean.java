package com.springframework.sfgdi.beanLifeCycle;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    public SingletonBean() {
        // Create after Init Bean of Project --- It's Singleton -> so It is created 1 times.
        System.out.println("Creating a Singleton bean!!!");
    }

    public String getMyScope(){
        return "I'm a Singleton";
    }
}
