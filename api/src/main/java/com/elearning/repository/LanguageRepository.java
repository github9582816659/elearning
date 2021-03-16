package com.elearning.repository;

import com.elearning.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LanguageRepository extends JpaRepository<Language, Integer>, JpaSpecificationExecutor<Language> {

}
