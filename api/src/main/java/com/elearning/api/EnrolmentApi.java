package com.elearning.api;

import com.elearning.entity.dto.EnrollmentDTO;
import com.elearning.service.EnrollmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/enrollments")
@Slf4j
public class EnrolmentApi {

    private EnrollmentService enrollmentService;

    public EnrolmentApi(EnrollmentService enrollmentService) {
        this.enrollmentService = enrollmentService;
    }

    // get student and course detail and save to db
    @PostMapping
    public EnrollmentDTO enroll(@RequestBody EnrollmentDTO enrollmentDTO) {
        log.info("EnrollmentDTO -> {}", enrollmentDTO);
        return enrollmentService.enrollStudent(enrollmentDTO);
    }

    @GetMapping(params = { "page", "size" })
    public List<EnrollmentDTO> findAll(@RequestParam("page") int page,
                                       @RequestParam("size") int size) {
        return enrollmentService.findAll(page, size);
    }

    @GetMapping("{id}")
    public EnrollmentDTO findById(@PathVariable String id) {
        return enrollmentService.findById(Integer.valueOf(id));
    }
}
