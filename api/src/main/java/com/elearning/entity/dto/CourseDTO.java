package com.elearning.entity.dto;

import com.elearning.entity.Language;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseDTO {
    private Integer id;
    private String courseTitle;
    private String courseBrief;
    private InstructorDTO instructor;
    private Integer numOfChapters;
    private Integer courseFee;
    private Language language;
}
