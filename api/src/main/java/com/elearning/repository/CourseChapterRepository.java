package com.elearning.repository;

import com.elearning.entity.CourseChapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CourseChapterRepository extends JpaRepository<CourseChapter, Integer>, JpaSpecificationExecutor<CourseChapter> {

}
