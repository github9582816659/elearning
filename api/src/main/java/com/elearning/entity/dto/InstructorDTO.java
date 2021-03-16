package com.elearning.entity.dto;

public class InstructorDTO {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private java.sql.Date registrationDate;
    private String qualification;
    private String introductionBrief;
    private byte[] image;
    private Integer numOfPublishedCourses;
    private Integer numOfEnrolledStudents;
    private Integer averageReviewRating;
    private Integer numOfReviews;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public java.sql.Date getRegistrationDate() {
        return this.registrationDate;
    }

    public void setRegistrationDate(java.sql.Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getQualification() {
        return this.qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getIntroductionBrief() {
        return this.introductionBrief;
    }

    public void setIntroductionBrief(String introductionBrief) {
        this.introductionBrief = introductionBrief;
    }

    public byte[] getImage() {
        return this.image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Integer getNumOfPublishedCourses() {
        return this.numOfPublishedCourses;
    }

    public void setNumOfPublishedCourses(Integer numOfPublishedCourses) {
        this.numOfPublishedCourses = numOfPublishedCourses;
    }

    public Integer getNumOfEnrolledStudents() {
        return this.numOfEnrolledStudents;
    }

    public void setNumOfEnrolledStudents(Integer numOfEnrolledStudents) {
        this.numOfEnrolledStudents = numOfEnrolledStudents;
    }

    public Integer getAverageReviewRating() {
        return this.averageReviewRating;
    }

    public void setAverageReviewRating(Integer averageReviewRating) {
        this.averageReviewRating = averageReviewRating;
    }

    public Integer getNumOfReviews() {
        return this.numOfReviews;
    }

    public void setNumOfReviews(Integer numOfReviews) {
        this.numOfReviews = numOfReviews;
    }
}
