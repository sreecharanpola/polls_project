package com.example.polls.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hellocontroller {
    @GetMapping("/greet")
    public  String sayHello(){
        return  "WELCOME TO SPRINGBOOT FRAMEWORK";
    }
    @GetMapping("/greet/{name}") //Mapping with input parameter
    public  String sayHelloWithName(@PathVariable("name") String inputName){
        return  "Hello "+inputName+", Welcome to springboot framework";
    }
}
