package com.example.javathymeleaf.Controller;

import com.example.javathymeleaf.Service.Pizza;
import com.example.javathymeleaf.Service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class PizzaController {

    private Pizza pizza;

    public PizzaController(Pizza pizza) {
        this.pizza = pizza;
    }


    public String getPizza() {
        return pizza.getPizza();
    }


    public void init() {
        System.out.println("init bean pizza controller");
    }

    public void destroy() {
        System.out.println("destroy pizza controller");
    }

}
