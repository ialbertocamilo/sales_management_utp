package com.utpproject.sales_management.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @RequestMapping("/home")
    public String home() {

        return " estas haciendo";
    }
}
