package com.nicknet.didemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public
class MyController {
    public String hello(){
        System.out.println("Hello");
        return "foo";
    }
}