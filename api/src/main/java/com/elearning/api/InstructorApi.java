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

import java.util.ArrayList;
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
    public InstructorDTO findByName(@PathVariable String firstName, @PathVariable String lastName) {
        Instructor byName = instructorService.findByName(firstName, lastName);
        return InstructorMapper.INSTANCE.instructorToInstructorDto(byName);
    }

    @GetMapping
    public List<InstructorDTO> findAll() {
        List<Instructor> all = instructorService.findAll();
        List<InstructorDTO> list = new ArrayList<>();
        for(Instructor instructor: all) {
            InstructorDTO instructorDTO = InstructorMapper.INSTANCE.instructorToInstructorDto(instructor);
            list.add(instructorDTO);
        }
        return list;
    }

    @PutMapping
    public InstructorDTO update(@RequestBody InstructorDTO instructorDTO) {
        Instructor instructor = InstructorMapper.INSTANCE.instructorDtoToInstructor(instructorDTO);
        Instructor update = instructorService.update(instructor);
        return InstructorMapper.INSTANCE.instructorToInstructorDto(update);
    }

    @DeleteMapping("/{firstName}/{lastName}")
    public String delete(@PathVariable String firstName, @PathVariable String lastName) {
        return instructorService.delete(firstName, lastName);
    }
}
