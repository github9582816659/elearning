package com.elearning.entity.dto;

import com.elearning.entity.Instructor;
import com.elearning.entity.Language;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseDTO {
    private Integer id;
    private String courseTitle;
    private String courseBrief;
    private Instructor instructor;
    private Integer numOfChapters;
    private Integer courseFee;
    private Language language;
}
