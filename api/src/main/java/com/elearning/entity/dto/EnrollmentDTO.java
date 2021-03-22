package com.elearning.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EnrollmentDTO {
    private Integer id;
    private StudentDTO student;
    private CourseDTO course;
    private LocalDate enrollmentDate;
    private Boolean paidSubscription;
}
