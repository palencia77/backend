package com.palencia77.backend.controller;

import com.palencia77.backend.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

/**
 * Created by palencia77 on 8/12/17.
 */
@Controller
@RequestMapping("/exercise")
public class ExerciseController {

    private static final String MESSAGE_VIEW = "message";

    @Autowired
    @Qualifier("exerciseService")
    private ExerciseService exerciseService;

    @GetMapping("/")
    public RedirectView redirectView(){
        return new RedirectView("/exercise/message");
    }

    @RequestMapping (value="/message", method=RequestMethod.GET)
    public String printMessage(Model model){
        exerciseService.logMessage();
        model.addAttribute("message", "Hello from my exercise controller");
        return MESSAGE_VIEW;
    }

}
