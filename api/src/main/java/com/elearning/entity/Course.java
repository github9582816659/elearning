package com.elearning.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "course")
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "course_title", nullable = false)
    private String courseTitle;

    @Column(name = "course_brief", nullable = false)
    private String courseBrief;

    @Column(name = "instructor_id", nullable = false)
    private Integer instructorId;

    @Column(name = "num_of_chapters", nullable = false)
    private Integer numOfChapters;

    @Column(name = "course_fee", nullable = false)
    private Integer courseFee;

    @Column(name = "language_id", nullable = false)
    private Integer languageId;

}
