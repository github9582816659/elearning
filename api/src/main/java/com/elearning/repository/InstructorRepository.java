package com.elearning.repository;

import com.elearning.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface InstructorRepository extends JpaRepository<Instructor, Integer>, JpaSpecificationExecutor<Instructor> {

    Instructor findByFirstNameAndLastName(String firstName, String lastName);
}
