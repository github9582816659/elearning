package com.elearning.repository;

import com.elearning.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Integer>, JpaSpecificationExecutor<Enrollment> {

}
