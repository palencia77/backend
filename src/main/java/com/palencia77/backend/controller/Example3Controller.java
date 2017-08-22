package com.palencia77.backend.controller;

import com.palencia77.backend.model.Person;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.validation.Valid;

/**
 * Created by palencia77 on 8/4/17.
 */
@Controller
@RequestMapping("/example3")
public class Example3Controller {

    private static final Log LOGGER = LogFactory.getLog(Example3Controller.class);

    public static final String FORM_VIEW = "form";
    public static final String RESULT_VIEW = "result";

    //redirect 1
    //@GetMapping("/")
    public String redirect(){
        return "redirect:/example3/showform";
    }

    //redirect 2
    @GetMapping("/")
    public RedirectView redirectView(){
        return new RedirectView("/example3/showform");
    }

    @GetMapping("/showform")
    public String showForm(Model model){
        LOGGER.info("INFO TRACE");
        model.addAttribute("person", new Person());
        //int i = 6/0; To show 500 error page
        return FORM_VIEW;
    }

    @PostMapping("/addperson")
    public ModelAndView addPerson(@Valid @ModelAttribute("person") Person person, BindingResult bindingResult){
        ModelAndView modelAndView = new ModelAndView();
        if (bindingResult.hasErrors()){
            modelAndView.setViewName(FORM_VIEW);
        } else {
            modelAndView.setViewName(RESULT_VIEW);
            modelAndView.addObject("person", person);
        }

        return modelAndView;
    }

}
