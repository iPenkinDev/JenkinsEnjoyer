package com.example.jenkinsenjoyer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @GetMapping("/index")
    @ResponseBody
    public String helloWorld() {
        return "Hello world #9";
    }
}
