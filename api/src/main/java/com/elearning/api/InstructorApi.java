package com.elearning.api;

import com.elearning.entity.dto.InstructorDTO;
import com.elearning.service.InstructorService;
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
public class InstructorApi {

    private final InstructorService instructorService;

    public InstructorApi(InstructorService instructorService) {
        this.instructorService = instructorService;
    }

    @PostMapping
    public InstructorDTO save(@RequestBody InstructorDTO instructorDTO) {
        return instructorService.save(instructorDTO);
    }

    @GetMapping("/{name}")
    public InstructorDTO findByName(@PathVariable String name) {
        return instructorService.findByName(name);
    }

    @GetMapping
    public List<InstructorDTO> findAll() {
        return instructorService.findAll();
    }

    @PutMapping
    public InstructorDTO update(@RequestBody InstructorDTO instructorDTO) {
        return instructorService.update(instructorDTO);
    }

    @DeleteMapping("/{name}")
    public boolean delete(@PathVariable String name) {
        return instructorService.delete(name);
    }
}
