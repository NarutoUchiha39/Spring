package com.SpringBoot.Expriment.Experiment1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(method = RequestMethod.GET,value = "/api")
public class HelloWorldController {
    @RequestMapping(method = RequestMethod.GET,value = "/hello")
    public String HelloWorld(){
        return new String("Hello world");
    }
}
