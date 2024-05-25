package com.springframework.sfgdi.beanLifeCycle;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {

    public PrototypeBean() {
        // Create when needed, not is Singleton. -> SCOPE_PROTOTYPE
        System.out.println("Creating a Prototype Bean!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    public String getMyScope(){
        return "I'm a Prototype";
    }
}