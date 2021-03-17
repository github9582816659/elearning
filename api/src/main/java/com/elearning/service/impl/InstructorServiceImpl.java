package com.elearning.service.impl;

import com.elearning.entity.dto.InstructorDTO;
import com.elearning.repository.InstructorRepository;
import com.elearning.service.InstructorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class InstructorServiceImpl implements InstructorService {

    private final InstructorRepository instructorRepository;

    public InstructorServiceImpl(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    @Override
    public InstructorDTO save(InstructorDTO instructorDTO) {
        return null;
    }

    @Override
    public InstructorDTO update(InstructorDTO instructorDTO) {
        return null;
    }

    @Override
    public InstructorDTO findByName(String name) {
        return null;
    }

    @Override
    public List<InstructorDTO> findAll() {
        return null;
    }

    @Override
    public boolean delete(String name) {
        return false;
    }
}
