package com.elearning.service;

import com.elearning.entity.Instructor;

import java.util.List;

public interface InstructorService {

    Instructor save(Instructor instructor);
    Instructor update(Instructor instructor);
    Instructor findByName(String firstName, String lastName);
    List<Instructor> findAll();
    String delete(String firstName, String lastName);
}
