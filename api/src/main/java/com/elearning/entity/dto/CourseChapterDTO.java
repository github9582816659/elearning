package com.elearning.entity.dto;

import com.elearning.entity.Course;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseChapterDTO {
    private Integer id;
    private Course course;
    private String chapterTitle;
    private Integer numOfReading;
    private Integer numOfVideo;
    private Integer numOfAssignment;
}
