package com.elearning.repository;

import com.elearning.entity.LearningProgress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LearningProgressRepository extends JpaRepository<LearningProgress, Integer>, JpaSpecificationExecutor<LearningProgress> {

}
