package com.elearning.service;

import com.elearning.entity.dto.InstructorDTO;

import java.util.List;

public interface InstructorService {

    InstructorDTO save(InstructorDTO instructorDTO);
    InstructorDTO update(InstructorDTO instructorDTO);
    InstructorDTO findByName(String name);
    List<InstructorDTO> findAll();
    boolean delete(String name);
}
