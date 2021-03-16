package com.elearning.entity.dto;

public class CourseDTO {
    private Integer id;
    private String courseTitle;
    private String courseBrief;
    private Integer instructorId;
    private Integer numOfChapters;
    private Integer courseFee;
    private Integer languageId;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseTitle() {
        return this.courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseBrief() {
        return this.courseBrief;
    }

    public void setCourseBrief(String courseBrief) {
        this.courseBrief = courseBrief;
    }

    public Integer getInstructorId() {
        return this.instructorId;
    }

    public void setInstructorId(Integer instructorId) {
        this.instructorId = instructorId;
    }

    public Integer getNumOfChapters() {
        return this.numOfChapters;
    }

    public void setNumOfChapters(Integer numOfChapters) {
        this.numOfChapters = numOfChapters;
    }

    public Integer getCourseFee() {
        return this.courseFee;
    }

    public void setCourseFee(Integer courseFee) {
        this.courseFee = courseFee;
    }

    public Integer getLanguageId() {
        return this.languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }
}
