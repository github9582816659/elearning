package com.elearning.entity.dto;

import com.elearning.entity.CourseChapterContent;
import com.elearning.entity.Enrollment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LearningProgressDTO {
    private Integer id;
    private EnrollmentDTO enrollment;
    private CourseChapterContentDTO courseChapterContent;
    private Date beginTimestamp;
    private Date completionTimestamp;
    private String status;
}
