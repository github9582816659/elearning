package com.elearning.entity.dto;

import com.elearning.entity.Enrollment;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class FeedbackDTO {
    private Integer id;
    private Enrollment enrollment;
    private Integer ratingScore;
    private String feedbackText;
    private LocalDate submissionDate;
}
