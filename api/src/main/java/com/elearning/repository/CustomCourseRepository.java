package com.elearning.repository;

import com.elearning.entity.Course;

import java.util.List;

public interface CustomCourseRepository {

    List<Course> searchCourseWithWildCard(String searchFor);
}
