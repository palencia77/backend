package com.palencia77.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by palencia77 on 8/4/17.
 */
@Controller
@RequestMapping("/example2")
public class Example2Controller {

    private static final String EXAMPLE2_VIEW = "example2";

    //localhost:8080/example2/request1?nm=Jesus
    @GetMapping("/request1")
    public ModelAndView request1(@RequestParam(name="nm", required=false, defaultValue="NULL") String name){
        ModelAndView modelAndView = new ModelAndView(EXAMPLE2_VIEW);
        modelAndView.addObject("nm_in_model", name);
        return modelAndView;
    }

    //localhost:8080/example2/request2/Jesus
    @GetMapping("/request2/{nm}")
    public ModelAndView request2(@PathVariable("nm") String name){
        ModelAndView modelAndView = new ModelAndView(EXAMPLE2_VIEW);
        modelAndView.addObject("nm_in_model", name);
        return modelAndView;
    }
}
