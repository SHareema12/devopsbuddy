package com.devopsbuddy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//indicating that this is a spring mvc controller
@Controller
public class HelloWorldController {

    //indicate that this is a request map to a certain html page
    @RequestMapping("/")
    public String sayHello(){
        return "index";
    }
}
