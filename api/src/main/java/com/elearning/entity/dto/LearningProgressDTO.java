package com.elearning.entity.dto;

import com.elearning.entity.CourseChapterContent;
import com.elearning.entity.Enrollment;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class LearningProgressDTO {
    private Integer id;
    private Enrollment enrollment;
    private CourseChapterContent courseChapterContent;
    private Date beginTimestamp;
    private Date completionTimestamp;
    private String status;
}
