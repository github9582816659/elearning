package com.elearning.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "course_chapter_content")
public class CourseChapterContent implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "course_chapter_id", nullable = false)
    private CourseChapter courseChapter;

    @ManyToOne
    @JoinColumn(name = "content_type_id", nullable = false)
    private ContentType contentType;

    @Column(name = "is_mandatory", nullable = false)
    private Boolean mandatory;

    @Column(name = "time_required_in_sec", nullable = false)
    private Integer timeRequiredInSec;

    @Column(name = "is_open_for_free", nullable = false)
    private Boolean openForFree;

}
