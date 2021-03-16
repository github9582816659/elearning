package com.elearning.entity.dto;

public class CourseChapterContentDTO {
    private Integer id;
    private Integer courseChapterId;
    private Integer contentTypeId;
    private Boolean isMandatory;
    private Integer timeRequiredInSec;
    private Boolean isOpenForFree;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseChapterId() {
        return this.courseChapterId;
    }

    public void setCourseChapterId(Integer courseChapterId) {
        this.courseChapterId = courseChapterId;
    }

    public Integer getContentTypeId() {
        return this.contentTypeId;
    }

    public void setContentTypeId(Integer contentTypeId) {
        this.contentTypeId = contentTypeId;
    }

    public Boolean getIsMandatory() {
        return this.isMandatory;
    }

    public void setIsMandatory(Boolean isMandatory) {
        this.isMandatory = isMandatory;
    }

    public Integer getTimeRequiredInSec() {
        return this.timeRequiredInSec;
    }

    public void setTimeRequiredInSec(Integer timeRequiredInSec) {
        this.timeRequiredInSec = timeRequiredInSec;
    }

    public Boolean getIsOpenForFree() {
        return this.isOpenForFree;
    }

    public void setIsOpenForFree(Boolean isOpenForFree) {
        this.isOpenForFree = isOpenForFree;
    }
}
