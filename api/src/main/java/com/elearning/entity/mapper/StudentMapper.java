package com.elearning.entity.mapper;

import com.elearning.entity.Student;
import com.elearning.entity.dto.StudentDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {

    StudentMapper INSTANCE = Mappers.getMapper( StudentMapper.class );

    StudentDTO studentToStudentDto(Student student);
    Student studentDtoToStudent(StudentDTO studentDTO);
}
