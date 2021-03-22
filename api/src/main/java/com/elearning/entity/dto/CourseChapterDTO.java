package com.elearning.entity.dto;

import com.elearning.entity.Course;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseChapterDTO {
    private Integer id;
    private Course course;
    private String chapterTitle;
    private Integer numOfReading;
    private Integer numOfVideo;
    private Integer numOfAssignment;
}
