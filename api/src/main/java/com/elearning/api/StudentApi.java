package com.elearning.api;

import com.elearning.entity.dto.StudentDTO;
import com.elearning.service.StudentService;
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
@RequestMapping("/v1/students")
public class StudentApi {

    private final StudentService studentService;

    public StudentApi(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public StudentDTO save(@RequestBody StudentDTO studentDTO) {
        return studentService.save(studentDTO);
    }

    @GetMapping("/{firstName}/{lastName}")
    public StudentDTO findByName(@PathVariable String firstName, @PathVariable String lastName) {
        return studentService.findByName(firstName, lastName);
    }

    @GetMapping
    public List<StudentDTO> findAll() {
        return studentService.findAll();
    }

    @PutMapping
    public StudentDTO update(@RequestBody StudentDTO studentDTO) {
        return studentService.update(studentDTO);
    }

    @DeleteMapping("/{firstName}/{lastName}")
    public String delete(@PathVariable String firstName, @PathVariable String lastName) {
        return studentService.delete(firstName, lastName);
    }
}
