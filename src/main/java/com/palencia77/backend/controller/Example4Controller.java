package com.palencia77.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by palencia77 on 8/11/17.
 */
@Controller
@RequestMapping("/example4")
public class Example4Controller {

    private static final String NOT_FOUND_404_VIEW="404";
    private static final String INTERNAL_ERROR_500_VIEW="500";

    @GetMapping("/notfound")
    public ModelAndView notFound(){
        ModelAndView modelAndView = new ModelAndView(NOT_FOUND_404_VIEW);
        return modelAndView;
    }

    @GetMapping("/internalerror")
    public ModelAndView internalError(){
        ModelAndView modelAndView = new ModelAndView(INTERNAL_ERROR_500_VIEW);
        return  modelAndView;
    }
}
