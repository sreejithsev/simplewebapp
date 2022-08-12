package com.example.simplewebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("/greet")
    @ResponseBody
    public String greet(){
        return "Hello World!";
    }
}
