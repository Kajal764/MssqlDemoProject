package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fundoo/user")
public class Controller {

    @Autowired
    Demorepo demorepo;

    @GetMapping("/verify")
    public Object validateUser() {
        List<first> all = demorepo.findAll();
        return all;
    }
}
