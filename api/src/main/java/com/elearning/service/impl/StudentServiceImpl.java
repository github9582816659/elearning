package com.elearning.service.impl;

import com.elearning.entity.Instructor;
import com.elearning.entity.Student;
import com.elearning.entity.dto.InstructorDTO;
import com.elearning.entity.dto.StudentDTO;
import com.elearning.entity.mapper.InstructorMapper;
import com.elearning.entity.mapper.StudentMapper;
import com.elearning.repository.StudentRepository;
import com.elearning.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public StudentDTO save(StudentDTO studentDTO) {
        Student student = StudentMapper.INSTANCE.studentDtoToStudent(studentDTO);
        Student savedStudent = studentRepository.save(student);
        StudentDTO savedStudentDTO = StudentMapper.INSTANCE.studentToStudentDto(savedStudent);
        return savedStudentDTO;
    }

    @Override
    public StudentDTO update(StudentDTO studentDTO) {
        Student student = StudentMapper.INSTANCE.studentDtoToStudent(studentDTO);
        Student savedStudent = studentRepository.save(student);
        StudentDTO savedStudentDTO = StudentMapper.INSTANCE.studentToStudentDto(savedStudent);
        return savedStudentDTO;
    }

    @Override
    public StudentDTO findByName(String firstName, String lastName) {
        Student student= studentRepository.findByFirstNameAndLastName(firstName, lastName);
        if (student != null) {
            return StudentMapper.INSTANCE.studentToStudentDto(student);
        }
        return null;
    }

    @Override
    public List<StudentDTO> findAll() {
        return studentRepository.findAll().stream().map(student -> StudentMapper.INSTANCE.studentToStudentDto(student)).collect(Collectors.toList());
    }

    @Override
    public String delete(String firstName, String lastName) {
        Student student= studentRepository.findByFirstNameAndLastName(firstName, lastName);
        if (student != null) {
            studentRepository.delete(student);
            return "Student removed successfully";
        }
        else {
            return "Student Not Found";
        }
    }
}
