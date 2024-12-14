package com.example.javathymeleaf.Service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PizzaService implements Pizza{

    @Override
    public String getPizza() {
        return "pizza service";
    }

}
