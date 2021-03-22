package com.elearning.repository;

import com.elearning.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StudentRepository extends JpaRepository<Student, Integer>, JpaSpecificationExecutor<Student> {

    Student findByFirstNameAndLastName(String firstName, String lastName);
}
