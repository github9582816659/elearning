package com.elearning.entity.dto;

public class LearningProgressDTO {
    private Integer id;
    private Integer enrollmentId;
    private Integer courseChapterContentId;
    private java.sql.Timestamp beginTimestamp;
    private java.sql.Timestamp completionTimestamp;
    private String status;

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

    public Integer getCourseChapterContentId() {
        return this.courseChapterContentId;
    }

    public void setCourseChapterContentId(Integer courseChapterContentId) {
        this.courseChapterContentId = courseChapterContentId;
    }

    public java.sql.Timestamp getBeginTimestamp() {
        return this.beginTimestamp;
    }

    public void setBeginTimestamp(java.sql.Timestamp beginTimestamp) {
        this.beginTimestamp = beginTimestamp;
    }

    public java.sql.Timestamp getCompletionTimestamp() {
        return this.completionTimestamp;
    }

    public void setCompletionTimestamp(java.sql.Timestamp completionTimestamp) {
        this.completionTimestamp = completionTimestamp;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
