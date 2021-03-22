package com.elearning.api;

import com.elearning.entity.Instructor;
import com.elearning.entity.dto.InstructorDTO;
import com.elearning.entity.mapper.InstructorMapper;
import com.elearning.service.InstructorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/instructors")
@Slf4j
public class InstructorApi {

    private final InstructorService instructorService;

    public InstructorApi(InstructorService instructorService) {
        this.instructorService = instructorService;
    }

    @PostMapping
    public InstructorDTO save(@RequestBody InstructorDTO instructorDTO) {

        Instructor instructor = InstructorMapper.INSTANCE.instructorDtoToInstructor(instructorDTO);
        Instructor savedInstructor = instructorService.save(instructor);
        InstructorDTO savedInstructorDTO = InstructorMapper.INSTANCE.instructorToInstructorDto(savedInstructor);
        return savedInstructorDTO;

    }

    @GetMapping("/{firstName}/{lastName}")
    public Instructor findByName(@PathVariable String firstName, @PathVariable String lastName) {
        return instructorService.findByName(firstName, lastName);
    }

    @GetMapping
    public List<Instructor> findAll() {
        return instructorService.findAll();
    }

    @PutMapping
    public Instructor update(@RequestBody InstructorDTO instructorDTO) {
        Instructor instructor = InstructorMapper.INSTANCE.instructorDtoToInstructor(instructorDTO);
        return instructorService.update(instructor);
    }

    @DeleteMapping("/{firstName}/{lastName}")
    public String delete(@PathVariable String firstName, @PathVariable String lastName) {
        return instructorService.delete(firstName, lastName);
    }
}
