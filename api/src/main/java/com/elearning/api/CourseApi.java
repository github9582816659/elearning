package com.elearning.api;

import com.elearning.entity.Course;
import com.elearning.entity.dto.CourseDTO;
import com.elearning.entity.dto.InstructorDTO;
import com.elearning.entity.mapper.CourseListMapper;
import com.elearning.entity.mapper.CourseMapper;
import com.elearning.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/courses")
@Slf4j
public class CourseApi {

    private final CourseService courseService;

    public CourseApi(CourseService courseService) {
        this.courseService = courseService;
    }


    @PostMapping
    public CourseDTO save(@RequestBody CourseDTO courseDTO) {
        Course course = CourseListMapper.INSTANCE.courseDtoToCourse(courseDTO);
        Course savedCourse = courseService.save(course);
        CourseDTO savedCourseDTO = CourseMapper.INSTANCE.courseToCourseDto(savedCourse);
        return savedCourseDTO;
    }

    @GetMapping("/{id}")
    public CourseDTO findById(@PathVariable("id") Integer id) {
        Course byCourseTitle = courseService.findById(id);
        return CourseMapper.INSTANCE.courseToCourseDto(byCourseTitle);
    }


    @GetMapping
    public List<CourseDTO> findAll() {
        List<CourseDTO> collect = new ArrayList<>();
        for (Course course : courseService.findAll()) {
            CourseDTO courseDTO = CourseListMapper.INSTANCE.courseToCourseDto(course);
            collect.add(courseDTO);
        }
        return collect;
    }

    @PutMapping
    public CourseDTO update(@RequestBody CourseDTO courseDTO) {
        Course course = CourseMapper.INSTANCE.courseDtoToCourse(courseDTO);
        Course savedCourse = courseService.save(course);
        CourseDTO savedCourseDTO = CourseMapper.INSTANCE.courseToCourseDto(savedCourse);
        return savedCourseDTO;
    }

    @DeleteMapping("/{name}")
    public String delete(@PathVariable String name) {
        return courseService.delete(name);
    }

    @GetMapping("/find")
    public List<CourseDTO> findCourses(@RequestParam String search) {
        return null;
    }
    
    
}
