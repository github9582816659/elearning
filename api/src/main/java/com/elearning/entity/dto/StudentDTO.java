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
public class StudentDTO {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate registrationDate;
    private Integer numOfCoursesEnrolled;
    private Integer numOfCoursesCompleted;
}
