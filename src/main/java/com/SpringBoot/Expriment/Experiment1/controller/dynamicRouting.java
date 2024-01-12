package com.SpringBoot.Expriment.Experiment1.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(method = RequestMethod.GET,value = "/api")
public class dynamicRouting {
    @RequestMapping(method = RequestMethod.GET,value = "/{okii}/{name}")
    public String DynamicRoute(@PathVariable String name,@PathVariable String okii){
        return name+okii;
    }
}
