package com.elearning.entity.dto;

public class CourseChapterDTO {
    private Integer id;
    private Integer courseId;
    private String chapterTitle;
    private Integer numOfReading;
    private Integer numOfVideo;
    private Integer numOfAssignment;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseId() {
        return this.courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getChapterTitle() {
        return this.chapterTitle;
    }

    public void setChapterTitle(String chapterTitle) {
        this.chapterTitle = chapterTitle;
    }

    public Integer getNumOfReading() {
        return this.numOfReading;
    }

    public void setNumOfReading(Integer numOfReading) {
        this.numOfReading = numOfReading;
    }

    public Integer getNumOfVideo() {
        return this.numOfVideo;
    }

    public void setNumOfVideo(Integer numOfVideo) {
        this.numOfVideo = numOfVideo;
    }

    public Integer getNumOfAssignment() {
        return this.numOfAssignment;
    }

    public void setNumOfAssignment(Integer numOfAssignment) {
        this.numOfAssignment = numOfAssignment;
    }
}
