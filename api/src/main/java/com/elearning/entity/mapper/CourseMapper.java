package com.elearning.entity.mapper;

import com.elearning.entity.Course;
import com.elearning.entity.dto.CourseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CourseMapper {

    CourseMapper INSTANCE = Mappers.getMapper( CourseMapper.class );

    @Mapping(target = "instructor", ignore = true)
    @Mapping(target = "language", ignore = true)
    CourseDTO courseToCourseDto(Course course);

    Course courseDtoToCourse(CourseDTO courseDTO);

}
