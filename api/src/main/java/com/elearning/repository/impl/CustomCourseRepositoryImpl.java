package com.elearning.repository.impl;

import com.elearning.entity.Course;
import com.elearning.repository.CustomCourseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class CustomCourseRepositoryImpl implements CustomCourseRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Course> searchCourseWithWildCard(String searchFor) {

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Course> cq = cb.createQuery(Course.class);
        Root<Course> course = cq.from(Course.class);

        Predicate predicate = cb.like(course.get("courseTitle"), "%" + searchFor + "%");

        TypedQuery<Course> query = entityManager.createQuery(cq);
        return query.getResultList();
    }
}
