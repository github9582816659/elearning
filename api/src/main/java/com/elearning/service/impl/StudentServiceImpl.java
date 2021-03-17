package com.elearning.service.impl;

import com.elearning.entity.dto.StudentDTO;
import com.elearning.repository.StudentRepository;
import com.elearning.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public StudentDTO save(StudentDTO studentDTO) {
        return null;
    }

    @Override
    public StudentDTO update(StudentDTO studentDTO) {
        return null;
    }

    @Override
    public StudentDTO findByName(String name) {
        return null;
    }

    @Override
    public List<StudentDTO> findAll() {
        return null;
    }

    @Override
    public boolean delete(String name) {
        return false;
    }
}
