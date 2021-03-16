package com.elearning.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "instructor")
public class Instructor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "registration_date", nullable = false)
    private LocalDate registrationDate;

    @Column(name = "qualification", nullable = false)
    private String qualification;

    @Column(name = "introduction_brief", nullable = false)
    private String introductionBrief;

    @Column(name = "num_of_published_courses", nullable = false)
    private Integer numOfPublishedCourses;

    @Column(name = "num_of_enrolled_students", nullable = false)
    private Integer numOfEnrolledStudents;

    @Column(name = "average_review_rating", nullable = false)
    private Integer averageReviewRating;

    @Column(name = "num_of_reviews", nullable = false)
    private Integer numOfReviews;

    @Column(name = "image", nullable = false)
    private byte[] image;

}
