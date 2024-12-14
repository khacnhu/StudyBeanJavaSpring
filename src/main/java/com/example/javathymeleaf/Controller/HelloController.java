package com.example.javathymeleaf.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping( value = {"/hello", "nhu", "tran"})
    public String helloworld(Model model) {
        model.addAttribute("message", "hello tran khac nhu in the world");
        return "hello-page";
    }


}
