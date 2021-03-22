package com.elearning.entity;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "registration_date", nullable = false)
    private LocalDate registrationDate;

    @Column(name = "num_of_courses_enrolled", nullable = false)
    private Integer numOfCoursesEnrolled;

    @Column(name = "num_of_courses_completed", nullable = false)
    private Integer numOfCoursesCompleted;

    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY)
    private Set<Enrollment> enrollments = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return new EqualsBuilder().append(id, student.id).append(firstName, student.firstName).append(lastName, student.lastName).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(firstName).append(lastName).toHashCode();
    }
}
