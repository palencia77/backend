package com.palencia77.backend.service.impl;

import com.palencia77.backend.entity.Course;
import com.palencia77.backend.repository.CourseRepository;
import com.palencia77.backend.service.CourseService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by palencia77 on 8/21/17.
 */
@Service("courseService")
public class CourseServiceImpl implements CourseService {
    private static final Log LOG = LogFactory.getLog(CourseServiceImpl.class);

    @Autowired
    @Qualifier("courseRepository")
    private CourseRepository courseRepository;

    @Override
    public List<Course> listAllCourses() {
        LOG.info("call: listAllCourses()");
        return courseRepository.findAll();
    }

    @Override
    public Course addCourse(Course course) {
        LOG.info("call: addCourse(Course course)" + " -- Param: " + course.toString());
        return courseRepository.save(course);
    }

    @Override
    public int deleteCourse(int id) {
        courseRepository.delete(id);
        return 0;
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }
}
