package com.elearning.service.impl;

import com.elearning.entity.Enrollment;
import com.elearning.entity.dto.EnrollmentDTO;
import com.elearning.entity.mapper.EnrollmentMapper;
import com.elearning.repository.EnrollmentRepository;
import com.elearning.service.EnrollmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
@Slf4j
public class EnrollmentServiceImpl implements EnrollmentService {

    private EnrollmentRepository enrollmentRepository;

    public EnrollmentServiceImpl(EnrollmentRepository enrollmentRepository) {
        this.enrollmentRepository = enrollmentRepository;
    }

    @Override
    public EnrollmentDTO enrollStudent(EnrollmentDTO enrollmentDTO) {
        Enrollment enrollment = EnrollmentMapper.INSTANCE.enrollmentDtoToEnrollment(enrollmentDTO);
        log.info("Enrollment -> {}", enrollment);
        Enrollment savedEnrollment = enrollmentRepository.save(enrollment);
        return EnrollmentMapper.INSTANCE.enrollmentToEnrollmentDto(savedEnrollment);
    }

    @Override
    public List<EnrollmentDTO> findAll(int page, int size) {
        Pageable limit = PageRequest.of(page,size);
        return enrollmentRepository.findAll(limit).stream().map(enrollment -> EnrollmentMapper.INSTANCE.enrollmentToEnrollmentDto(enrollment)).collect(Collectors.toList());
    }

    @Override
    public EnrollmentDTO findById(Integer id) {
        Optional<Enrollment> byId = enrollmentRepository.findById(id);
        return EnrollmentMapper.INSTANCE.enrollmentToEnrollmentDto(byId.get());
    }
}
