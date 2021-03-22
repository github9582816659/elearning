package com.elearning.entity.mapper;

import com.elearning.entity.Instructor;
import com.elearning.entity.dto.InstructorDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface InstructorMapper {

    InstructorMapper INSTANCE = Mappers.getMapper( InstructorMapper.class );

    InstructorDTO instructorToInstructorDto(Instructor instructor);
    Instructor instructorDtoToInstructor(InstructorDTO instructorDTO);
}
