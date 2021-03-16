package com.elearning.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "course_chapter_content")
public class CourseChapterContent implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "course_chapter_id", nullable = false)
    private Integer courseChapterId;

    @Column(name = "content_type_id", nullable = false)
    private Integer contentTypeId;

    @Column(name = "is_mandatory", nullable = false)
    private Boolean mandatory;

    @Column(name = "time_required_in_sec", nullable = false)
    private Integer timeRequiredInSec;

    @Column(name = "is_open_for_free", nullable = false)
    private Boolean openForFree;

}
