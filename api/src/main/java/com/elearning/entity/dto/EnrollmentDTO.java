package com.elearning.entity.dto;

import com.elearning.entity.Course;
import com.elearning.entity.Student;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class EnrollmentDTO {
    private Integer id;
    private Student student;
    private Course course;
    private LocalDate enrollmentDate;
    private Boolean isPaidSubscription;
}
