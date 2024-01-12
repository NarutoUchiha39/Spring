package com.SpringBoot.Expriment.Experiment1.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(method = RequestMethod.GET,value = "/Collection")
public class Collection {
    public List<Students> Students= new ArrayList<>();
    Collection(){
        
    }
    
}
