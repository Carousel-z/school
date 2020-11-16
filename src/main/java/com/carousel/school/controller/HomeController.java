package com.carousel.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Hello, Carousel";
    }

    @RequestMapping("/login")
    public String login(){
        return "Login";
    }
}
