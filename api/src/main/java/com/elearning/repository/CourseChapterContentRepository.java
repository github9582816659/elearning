package com.elearning.repository;

import com.elearning.entity.CourseChapterContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CourseChapterContentRepository extends JpaRepository<CourseChapterContent, Integer>, JpaSpecificationExecutor<CourseChapterContent> {

}
