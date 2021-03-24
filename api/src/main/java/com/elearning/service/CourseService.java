package com.elearning.service;

import com.elearning.entity.Course;

import java.util.List;

public interface CourseService {

    Course save(Course course);
    Course update(Course course);
    Course findById(Integer title);
    List<Course> findAll();
    String delete(String name);

    List<Course> searchCourseWithWildCard(String searchFor);

}
