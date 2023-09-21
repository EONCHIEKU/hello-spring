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

}
