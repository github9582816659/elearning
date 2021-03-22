package com.elearning.entity.mapper;

import com.elearning.entity.Course;
import com.elearning.entity.Enrollment;
import com.elearning.entity.Instructor;
import com.elearning.entity.Language;
import com.elearning.entity.Student;
import com.elearning.entity.dto.CourseDTO;
import com.elearning.entity.dto.EnrollmentDTO;
import com.elearning.entity.dto.InstructorDTO;
import com.elearning.entity.dto.LanguageDTO;
import com.elearning.entity.dto.StudentDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EnrollmentMapper {

    EnrollmentMapper INSTANCE = Mappers.getMapper( EnrollmentMapper.class );

    EnrollmentDTO enrollmentToEnrollmentDto(Enrollment enrollment);
    Enrollment enrollmentDtoToEnrollment(EnrollmentDTO enrollmentDTO);

    StudentDTO studentToStudentDto(Student student);
    Student studentDtoToStudent(StudentDTO studentDTO);

    CourseDTO courseToCourseDto(Course course);
    Course courseDtoToCourse(CourseDTO courseDTO);

    InstructorDTO instructorToInstructorDto(Instructor instructor);
    Instructor instructorDtoToInstructor(InstructorDTO instructorDTO);

    LanguageDTO languageToLanguageDto(Language language);
    Language languageDtoToLanguage(LanguageDTO languageDTO);

}
