package com.elearning.entity.dto;

public class FeedbackDTO {
    private Integer id;
    private Integer enrollmentId;
    private Integer ratingScore;
    private String feedbackText;
    private java.sql.Date submissionDate;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEnrollmentId() {
        return this.enrollmentId;
    }

    public void setEnrollmentId(Integer enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public Integer getRatingScore() {
        return this.ratingScore;
    }

    public void setRatingScore(Integer ratingScore) {
        this.ratingScore = ratingScore;
    }

    public String getFeedbackText() {
        return this.feedbackText;
    }

    public void setFeedbackText(String feedbackText) {
        this.feedbackText = feedbackText;
    }

    public java.sql.Date getSubmissionDate() {
        return this.submissionDate;
    }

    public void setSubmissionDate(java.sql.Date submissionDate) {
        this.submissionDate = submissionDate;
    }
}
