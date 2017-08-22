package com.palencia77.backend.controller;

import com.palencia77.backend.entity.Course;
import com.palencia77.backend.service.CourseService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by palencia77 on 8/21/17.
 */
@Controller
@RequestMapping("/courses")
public class CourseController {

    private static final Log LOG = LogFactory.getLog(CourseController.class);
    private static final String COURSES_VIEW = "courses";
    @Autowired
    @Qualifier("courseService")
    private CourseService courseService;

    @GetMapping("/listcourses")
    public ModelAndView listAllCourses(){
        LOG.info("call: listAllCourses()");
        ModelAndView modelAndView = new ModelAndView("courses");
        modelAndView.addObject("courses", courseService.listAllCourses());
        modelAndView.addObject("course", new Course());
        return modelAndView;
    }

    @PostMapping("/addcourse")
    public String addCourse(@ModelAttribute("course") Course course){
        LOG.info("call: addCourse()" + " -- Param: " + course.toString());
        courseService.addCourse(course);
        return "redirect:/courses/listcourses";
    }
}
