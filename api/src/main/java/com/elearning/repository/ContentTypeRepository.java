package com.elearning.repository;

import com.elearning.entity.ContentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ContentTypeRepository extends JpaRepository<ContentType, Integer>, JpaSpecificationExecutor<ContentType> {

}
