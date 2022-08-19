package com.example.Springboottutorial.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {
//    @RequestMapping(value = "/",method = RequestMethod.GET)
    @GetMapping("/")
    public String Hello(){

        return "Hello to springboot tut njnjnj";
    }
}
