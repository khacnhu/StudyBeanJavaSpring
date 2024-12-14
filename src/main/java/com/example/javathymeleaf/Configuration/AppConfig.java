package com.example.javathymeleaf.Configuration;

import com.example.javathymeleaf.Controller.PizzaController;
import com.example.javathymeleaf.Service.NonPizzaService;
import com.example.javathymeleaf.Service.Pizza;
import com.example.javathymeleaf.Service.PizzaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.swing.plaf.PanelUI;

@Configuration
public class AppConfig {

    @Bean
    public Pizza pizza() {
        return new PizzaService();
    }

    @Bean
    public Pizza nonPizza() {
        return new NonPizzaService();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public PizzaController pizzaController() {
        return new PizzaController(pizza());
    }



}
