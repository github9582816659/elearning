package com.elearning.service.impl;

import com.elearning.entity.Instructor;
import com.elearning.entity.dto.InstructorDTO;
import com.elearning.entity.mapper.InstructorMapper;
import com.elearning.repository.InstructorRepository;
import com.elearning.service.InstructorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@Slf4j
public class InstructorServiceImpl implements InstructorService {

    private final InstructorRepository instructorRepository;

    public InstructorServiceImpl(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    @Override
    public Instructor save(Instructor instructor) {
        Instructor savedInstructor = instructorRepository.save(instructor);
        return savedInstructor;
    }

    @Override
    public Instructor update(Instructor instructor) {
        Instructor savedInstructor = instructorRepository.save(instructor);
        return savedInstructor;
    }

    @Override
    public Instructor findByName(String firstName, String lastName) {
        Instructor instructor= instructorRepository.findByFirstNameAndLastName(firstName, lastName);
        if (instructor != null) {
            return instructor;
        }
        return null;
    }

    @Override
    public List<Instructor> findAll() {
        return instructorRepository.findAll();
    }

    @Override
    public String delete(String firstName, String lastName) {
        Instructor instructor= instructorRepository.findByFirstNameAndLastName(firstName, lastName);
        if (instructor != null) {
            instructorRepository.delete(instructor);
            return "Instructor removed successfully";
        }
        else {
            return "Instructor Not Found";
        }
    }
}
