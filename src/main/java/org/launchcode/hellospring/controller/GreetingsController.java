package org.launchcode.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class GreetingsController {
    @GetMapping
    @ResponseBody
    public String hello(){
        return "Hello Esther!";
    }
    //responds to get requests at "/goodbye"
    @GetMapping("goodbye")
    @ResponseBody

    public String goodbye(){
        return "Adios Esther!";
    }

    @PostMapping("shout")
    @ResponseBody

    public String sayWhat() {
        return "Shout it, Esther!";
    }
    @RequestMapping(value="hellogoodbye", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String hellogoodbye(){
        return "Hello and GoodBye";

    }
    // handler to handle request of the form /hello?name=LaunchCode: this is a query parameter
    @GetMapping("hello")
    @ResponseBody
    public String helloWithQueryParam( @RequestParam String name){
        return "Hello " + name + "!";
    }

    //Handles requests of the form /hello/LaunchCode = this is a path parameter, launchcode is part of the path
    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloWithPathParam(@PathVariable String name){
        return "Hello " + name + "!";
    }
}
