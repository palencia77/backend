package com.palencia77.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by palencia77 on 7/31/17.
 */
@Controller
@RequestMapping("/say")
public class HelloWorldController {

    @GetMapping("helloworld")
    public String helloWorld(){
        return "helloworld";
    }
}
