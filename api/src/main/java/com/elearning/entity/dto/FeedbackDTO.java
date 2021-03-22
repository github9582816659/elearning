package com.elearning.entity.dto;

import com.elearning.entity.Enrollment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FeedbackDTO {
    private Integer id;
    private EnrollmentDTO enrollment;
    private Integer ratingScore;
    private String feedbackText;
    private LocalDate submissionDate;
}
