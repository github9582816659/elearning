package com.elearning.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "course_chapter")
public class CourseChapter implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "course_id", nullable = false)
    private Integer courseId;

    @Column(name = "chapter_title", nullable = false)
    private String chapterTitle;

    @Column(name = "num_of_reading", nullable = false)
    private Integer numOfReading;

    @Column(name = "num_of_video", nullable = false)
    private Integer numOfVideo;

    @Column(name = "num_of_assignment", nullable = false)
    private Integer numOfAssignment;

}
