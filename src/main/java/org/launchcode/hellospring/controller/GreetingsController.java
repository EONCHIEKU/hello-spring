package org.launchcode.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingsController {
    @GetMapping
    @ResponseBody
    public String hello(){
        return "Hello Esther!";
    }
    @GetMapping("goodbye")
    @ResponseBody

    public String goodbye(){
        return "Adios Esther!";
    }
}
