package com.elearning.service.impl;

import com.elearning.entity.Course;
import com.elearning.repository.CourseRepository;
import com.elearning.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@Slf4j
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public Course save(Course course) {
        Course savedCourse = courseRepository.save(course);
        return savedCourse;
    }

    @Override
    public Course update(Course course) {
        Course savedCourse = courseRepository.save(course);
        return savedCourse;
    }

    @Override
    public Course findById(Integer id) {
        Optional<Course> course= courseRepository.findById(id);
        if (course.isPresent()) {
            return course.get();
        }
        return null;
    }

    @Override
    public List<Course> findAll() {
        List<Course> all = courseRepository.findAll();
        return all;
    }

    @Override
    public String delete(String title) {
        Course course= courseRepository.findByCourseTitle(title);
        if (course != null) {
            courseRepository.delete(course);
            return "Course removed successfully";
        }
        else {
            return "Course Not Found";
        }
    }

    @Override
    public List<Course> searchCourseWithWildCard(String searchFor) {
        Collection<Course> courseListNative = courseRepository.findCourseListNative(searchFor);
        for (Course course: courseListNative) {
            log.info("Course -> {}", course);
        }
        return null;
        //return courseRepository.searchCourseWithWildCard(searchFor).stream().map(course -> CourseMapper.INSTANCE.courseToCourseDto(course)).collect(Collectors.toList());
    }
}
