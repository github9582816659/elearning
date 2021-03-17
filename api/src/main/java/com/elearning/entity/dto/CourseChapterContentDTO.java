package com.elearning.entity.dto;

import com.elearning.entity.ContentType;
import com.elearning.entity.CourseChapter;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseChapterContentDTO {
    private Integer id;
    private CourseChapter courseChapter;
    private ContentType contentType;
    private Boolean isMandatory;
    private Integer timeRequiredInSec;
    private Boolean isOpenForFree;

}
