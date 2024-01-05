package com.SpringBoot.Expriment.Experiment1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @RequestMapping(method = RequestMethod.GET,value = "/")
    public String Home(){
        return "Hi Mom";
    }
}
