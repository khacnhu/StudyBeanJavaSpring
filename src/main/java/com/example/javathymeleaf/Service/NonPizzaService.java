package com.example.javathymeleaf.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class NonPizzaService implements Pizza{

    @Override
    public String getPizza() {
        return "non pizza service";
    }
}
