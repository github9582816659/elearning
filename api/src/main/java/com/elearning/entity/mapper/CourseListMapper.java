package com.elearning.entity.mapper;

import com.elearning.entity.Course;
import com.elearning.entity.dto.CourseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CourseListMapper {

    CourseListMapper INSTANCE = Mappers.getMapper( CourseListMapper.class );

    @Mapping(target = "instructor.averageReviewRating", ignore = true)
    @Mapping(target = "instructor.email", ignore = true)
    @Mapping(target = "instructor.firstName", ignore = true)
    @Mapping(target = "instructor.lastName", ignore = true)
    @Mapping(target = "instructor.introductionBrief", ignore = true)
    @Mapping(target = "instructor.numOfEnrolledStudents", ignore = true)
    @Mapping(target = "instructor.numOfPublishedCourses", ignore = true)
    @Mapping(target = "instructor.numOfReviews", ignore = true)
    @Mapping(target = "instructor.qualification", ignore = true)
    @Mapping(target = "instructor.registrationDate", ignore = true)
    @Mapping(target = "language", ignore = true)
    CourseDTO courseToCourseDto(Course course);

    Course courseDtoToCourse(CourseDTO courseDTO);

}
