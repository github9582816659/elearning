package com.elearning.entity.dto;

public class EnrollmentDTO {
    private Integer id;
    private Integer studentId;
    private Integer courseId;
    private java.sql.Date enrollmentDate;
    private Boolean isPaidSubscription;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return this.studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getCourseId() {
        return this.courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public java.sql.Date getEnrollmentDate() {
        return this.enrollmentDate;
    }

    public void setEnrollmentDate(java.sql.Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public Boolean getIsPaidSubscription() {
        return this.isPaidSubscription;
    }

    public void setIsPaidSubscription(Boolean isPaidSubscription) {
        this.isPaidSubscription = isPaidSubscription;
    }
}
