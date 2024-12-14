package com.example.javathymeleaf;

import com.example.javathymeleaf.Controller.PizzaController;
import com.example.javathymeleaf.Service.NonPizzaService;
import com.example.javathymeleaf.Service.PizzaService;
import com.example.javathymeleaf.Service.TestService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavathymeleafApplication {

	public static void main(String[] args) {

		var context = SpringApplication.run(JavathymeleafApplication.class, args);

		PizzaController pizzaController = context.getBean(PizzaController.class);
		System.out.println("check " + pizzaController.getPizza());

		TestService testService = context.getBean(TestService.class);
		System.out.println("service " + testService.testService());

	}

}
