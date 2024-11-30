package com.Abhijeet_project.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    // handler method to handle / helloworld request
    // http://localhost:8080/hello-world
    @GetMapping("/hello-world")
    public String helloworld(Model model){
        model.addAttribute("message", "Hello World!");
        return "hello-world";
    }
}
