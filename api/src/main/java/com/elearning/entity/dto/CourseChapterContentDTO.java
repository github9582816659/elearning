package com.elearning.entity.dto;

import com.elearning.entity.ContentType;
import com.elearning.entity.CourseChapter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseChapterContentDTO {
    private Integer id;
    private CourseChapter courseChapter;
    private ContentType contentType;
    private Boolean isMandatory;
    private Integer timeRequiredInSec;
    private Boolean isOpenForFree;

}
