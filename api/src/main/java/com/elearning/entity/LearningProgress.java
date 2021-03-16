package com.elearning.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "learning_progress")
public class LearningProgress implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "enrollment_id", nullable = false)
    private Integer enrollmentId;

    @Column(name = "course_chapter_content_id", nullable = false)
    private Integer courseChapterContentId;

    @Column(name = "begin_timestamp", nullable = false)
    private Date beginTimestamp;

    @Column(name = "completion_timestamp", nullable = false)
    private Date completionTimestamp;

    @Column(name = "status", nullable = false)
    private String status;

}
