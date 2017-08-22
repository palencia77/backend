package com.palencia77.backend.service;

import com.palencia77.backend.entity.Course;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;

/**
 * Created by palencia77 on 8/21/17.
 */
public interface CourseService {

    public List<Course> listAllCourses();

    public Course addCourse(Course course);

    public int deleteCourse(int id);

    public Course updateCourse(Course course);


}
