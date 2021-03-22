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
public class InstructorDTO {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate registrationDate;
    private String qualification;
    private String introductionBrief;
    private Integer numOfPublishedCourses;
    private Integer numOfEnrolledStudents;
    private Integer averageReviewRating;
    private Integer numOfReviews;
}
