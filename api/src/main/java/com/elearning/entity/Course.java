package com.elearning.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "course")
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "course_title", nullable = false)
    private String courseTitle;

    @Column(name = "course_brief", nullable = false)
    private String courseBrief;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "instructor_id", nullable = false)
    private Instructor instructor;

    @Column(name = "num_of_chapters", nullable = false)
    private Integer numOfChapters;

    @Column(name = "course_fee", nullable = false)
    private Integer courseFee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "language_id", nullable = false)
    private Language language;

    @OneToMany(mappedBy = "course",fetch = FetchType.LAZY)
    private Set<Enrollment> enrollments = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        return new EqualsBuilder().append(id, course.id).append(courseTitle, course.courseTitle).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(courseTitle).toHashCode();
    }
}
