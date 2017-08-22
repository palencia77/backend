package com.palencia77.backend.controller;

import com.palencia77.backend.component.ExampleComponent;
import com.palencia77.backend.model.Person;
import com.palencia77.backend.service.ExampleService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by palencia77 on 7/31/17.
 */
@Controller
@RequestMapping("/example")
public class ExampleController {

    private static final String EXAMPLE_VIEW = "example";
    private static final Log LOGGER = LogFactory.getLog(ExampleController.class);

    @Autowired
    @Qualifier("exampleComponent")
    private ExampleComponent exampleComponent;

    @Autowired
    @Qualifier("exampleService")
    private ExampleService exampleService;


    @RequestMapping(value = "/exampleString", method = RequestMethod.GET)
    public String exampleString(Model model){
        exampleComponent.sayHello();
        model.addAttribute("people", getPeople());
        return EXAMPLE_VIEW;
    }

    @GetMapping("/exampleModelAndView")
    public ModelAndView exampleModelAndView(){
        ModelAndView modelAndView = new ModelAndView(EXAMPLE_VIEW);
        modelAndView.addObject("people", getPeople());
        return modelAndView;
    }

    private List<Person> getPeople(){
        return exampleService.getListPeople();
    }
}
