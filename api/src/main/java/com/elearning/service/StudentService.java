package com.elearning.service;

import com.elearning.entity.dto.StudentDTO;

import java.util.List;

public interface StudentService {

    StudentDTO save(StudentDTO studentDTO);
    StudentDTO update(StudentDTO studentDTO);
    StudentDTO findByName(String firstName, String lastName);
    List<StudentDTO> findAll();
    String delete(String firstName, String lastName);
}
