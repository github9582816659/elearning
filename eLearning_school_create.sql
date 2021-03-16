DROP DATABASE elearning;
CREATE DATABASE elearning;
USE elearning;

-- tables
-- Table: content_type
CREATE TABLE content_type (
                              id int  NOT NULL,
                              content_type varchar(20)  NOT NULL,
                              CONSTRAINT content_type_pk PRIMARY KEY (id)
) ;

-- Table: course
CREATE TABLE course (
                        id int  NOT NULL,
                        course_title varchar(200)  NOT NULL,
                        course_brief varchar(4000)  NOT NULL,
                        instructor_id int  NOT NULL,
                        num_of_chapters int  NOT NULL,
                        course_fee int  NOT NULL,
                        language_id int  NOT NULL,
                        CONSTRAINT course_pk PRIMARY KEY (id)
) ;

-- Table: course_chapter
CREATE TABLE course_chapter (
                                id int  NOT NULL,
                                course_id int  NOT NULL,
                                chapter_title varchar(100)  NOT NULL,
                                num_of_reading int  NOT NULL,
                                num_of_video int  NOT NULL,
                                num_of_assignment int  NOT NULL,
                                CONSTRAINT course_chapter_pk PRIMARY KEY (id)
) ;

-- Table: course_chapter_content
CREATE TABLE course_chapter_content (
                                        id int  NOT NULL,
                                        course_chapter_id int  NOT NULL,
                                        content_type_id int  NOT NULL,
                                        is_mandatory char(1)  NOT NULL,
                                        time_required_in_sec int  NOT NULL,
                                        is_open_for_free char(1)  NOT NULL,
                                        CONSTRAINT course_chapter_content_pk PRIMARY KEY (id)
) ;

-- Table: enrollment
CREATE TABLE enrollment (
                            id int  NOT NULL,
                            student_id int  NOT NULL,
                            course_id int  NOT NULL,
                            enrollment_date date  NOT NULL,
                            is_paid_subscription char(1)  NOT NULL,
                            CONSTRAINT enrollment_pk PRIMARY KEY (id)
) ;

-- Table: feedback
CREATE TABLE feedback (
                          id int  NOT NULL,
                          enrollment_id int  NOT NULL,
                          rating_score int  NOT NULL,
                          feedback_text varchar(4000)  NULL,
                          submission_date date  NOT NULL,
                          CONSTRAINT feedback_pk PRIMARY KEY (id)
) ;

-- Table: instructor
CREATE TABLE instructor (
                            id int  NOT NULL,
                            first_name varchar(50)  NOT NULL,
                            last_name varchar(50)  NOT NULL,
                            email varchar(50)  NOT NULL,
                            registration_date date  NOT NULL,
                            qualification varchar(200)  NOT NULL,
                            introduction_brief varchar(1000)  NOT NULL,
                            image blob  NOT NULL,
                            num_of_published_courses int  NOT NULL,
                            num_of_enrolled_students int  NOT NULL,
                            average_review_rating int  NOT NULL,
                            num_of_reviews int  NOT NULL,
                            CONSTRAINT instructor_pk PRIMARY KEY (id)
) ;

-- Table: language
CREATE TABLE language (
                          id int  NOT NULL,
                          language_name varchar(50)  NOT NULL,
                          CONSTRAINT language_pk PRIMARY KEY (id)
) ;

-- Table: learning_progress
CREATE TABLE learning_progress (
                                   id int  NOT NULL,
                                   enrollment_id int  NOT NULL,
                                   course_chapter_content_id int  NOT NULL,
                                   begin_timestamp timestamp  NOT NULL,
                                   completion_timestamp timestamp  NOT NULL,
                                   status char(1)  NOT NULL,
                                   CONSTRAINT learning_progress_pk PRIMARY KEY (id)
) ;

-- Table: student
CREATE TABLE student (
                         id int  NOT NULL,
                         first_name varchar(100)  NULL,
                         last_name varchar(100)  NOT NULL,
                         email varchar(255)  NOT NULL,
                         registration_date date  NOT NULL,
                         num_of_courses_enrolled int  NOT NULL,
                         num_of_courses_completed int  NOT NULL,
                         CONSTRAINT student_pk PRIMARY KEY (id)
) ;

-- foreign keys
-- Reference: course_chapter_cnt_cnt_type (table: course_chapter_content)
ALTER TABLE course_chapter_content ADD CONSTRAINT course_chapter_cnt_cnt_type
    FOREIGN KEY (content_type_id)
        REFERENCES content_type (id);

-- Reference: course_chapter_cnt_crs_chapter (table: course_chapter_content)
ALTER TABLE course_chapter_content ADD CONSTRAINT course_chapter_cnt_crs_chapter
    FOREIGN KEY (course_chapter_id)
        REFERENCES course_chapter (id);

-- Reference: course_content_course (table: course_chapter)
ALTER TABLE course_chapter ADD CONSTRAINT course_content_course
    FOREIGN KEY (course_id)
        REFERENCES course (id);

-- Reference: course_instructor (table: course)
ALTER TABLE course ADD CONSTRAINT course_instructor
    FOREIGN KEY (instructor_id)
        REFERENCES instructor (id);

-- Reference: course_language (table: course)
ALTER TABLE course ADD CONSTRAINT course_language
    FOREIGN KEY (language_id)
        REFERENCES language (id);

-- Reference: enrollment_course (table: enrollment)
ALTER TABLE enrollment ADD CONSTRAINT enrollment_course
    FOREIGN KEY (course_id)
        REFERENCES course (id);

-- Reference: enrollment_student (table: enrollment)
ALTER TABLE enrollment ADD CONSTRAINT enrollment_student
    FOREIGN KEY (student_id)
        REFERENCES student (id);

-- Reference: feedback_enrollment (table: feedback)
ALTER TABLE feedback ADD CONSTRAINT feedback_enrollment
    FOREIGN KEY (enrollment_id)
        REFERENCES enrollment (id);

-- Reference: learning_prgs_crs_chapter_cnt (table: learning_progress)
ALTER TABLE learning_progress ADD CONSTRAINT learning_prgs_crs_chapter_cnt
    FOREIGN KEY (course_chapter_content_id)
        REFERENCES course_chapter_content (id);

-- Reference: learning_progress_enrollment (table: learning_progress)
ALTER TABLE learning_progress ADD CONSTRAINT learning_progress_enrollment
    FOREIGN KEY (enrollment_id)
        REFERENCES enrollment (id);

-- End of file.



