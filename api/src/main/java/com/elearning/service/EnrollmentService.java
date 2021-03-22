package com.elearning.service;

import com.elearning.entity.dto.EnrollmentDTO;

import java.util.List;

public interface EnrollmentService {
    EnrollmentDTO enrollStudent(EnrollmentDTO enrollmentDTO);

    List<EnrollmentDTO> findAll(int page, int size);

    EnrollmentDTO findById(Integer id);
}
