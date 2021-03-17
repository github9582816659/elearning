package com.elearning.entity.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class StudentDTO {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate registrationDate;
    private Integer numOfCoursesEnrolled;
    private Integer numOfCoursesCompleted;
}
