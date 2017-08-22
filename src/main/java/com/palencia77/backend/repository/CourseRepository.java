package com.palencia77.backend.repository;

import com.palencia77.backend.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by palencia77 on 8/21/17.
 */
@Repository("courseRepository")
public interface CourseRepository extends JpaRepository<Course, Serializable>{

    public List<Course> findByPrice(double price);
    public Course findByPriceAndName(double price, String name);
    public List<Course> findByNameOrderByHours(String name);
    public Course findByNameOrPrice(String name, double price);
}
