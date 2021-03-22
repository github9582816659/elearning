package com.elearning.repository;

import com.elearning.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

public interface CourseRepository extends JpaRepository<Course, Integer>, CustomCourseRepository, JpaSpecificationExecutor<Course> {

    Course findByCourseTitle(String name);

    @Query("SELECT c.id,c.courseTitle,c.courseBrief,c.instructor.firstName,c.instructor.lastName,c.numOfChapters,c.courseFee,c.language.languageName FROM Course c")
    Collection<Course> findCourseList();

    @Query(value = "SELECT * FROM course WHERE course_title LIKE '%?%'", nativeQuery = true)
    Collection<Course> findCourseListNative(String searchFor);
}
