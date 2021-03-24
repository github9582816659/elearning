DROP DATABASE elearning;
CREATE DATABASE elearning;
USE elearning;

-- tables
-- Table: content_type
CREATE TABLE content_type (
                              id int  NOT NULL auto_increment,
                              content_type varchar(20)  NOT NULL,
                              CONSTRAINT content_type_pk PRIMARY KEY (id)
) ;

-- Table: course
CREATE TABLE course (
                        id int  NOT NULL auto_increment,
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
                                id int  NOT NULL auto_increment,
                                course_id int  NOT NULL,
                                chapter_title varchar(100)  NOT NULL,
                                num_of_reading int  NOT NULL,
                                num_of_video int  NOT NULL,
                                num_of_assignment int  NOT NULL,
                                CONSTRAINT course_chapter_pk PRIMARY KEY (id)
) ;

-- Table: course_chapter_content
CREATE TABLE course_chapter_content (
                                        id int  NOT NULL auto_increment,
                                        course_chapter_id int  NOT NULL,
                                        content_type_id int  NOT NULL,
                                        is_mandatory char(1)  NOT NULL,
                                        time_required_in_sec int  NOT NULL,
                                        is_open_for_free char(1)  NOT NULL,
                                        CONSTRAINT course_chapter_content_pk PRIMARY KEY (id)
) ;

-- Table: enrollment
CREATE TABLE enrollment (
                            id int  NOT NULL auto_increment,
                            student_id int  NOT NULL,
                            course_id int  NOT NULL,
                            enrollment_date date  NOT NULL,
                            is_paid_subscription char(1)  NOT NULL,
                            CONSTRAINT enrollment_pk PRIMARY KEY (id)
) ;

-- Table: feedback
CREATE TABLE feedback (
                          id int  NOT NULL auto_increment,
                          enrollment_id int  NOT NULL,
                          rating_score int  NOT NULL,
                          feedback_text varchar(4000)  NULL,
                          submission_date date  NOT NULL,
                          CONSTRAINT feedback_pk PRIMARY KEY (id)
) ;

-- Table: instructor
CREATE TABLE instructor (
                            id int  NOT NULL auto_increment,
                            first_name varchar(50)  NOT NULL,
                            last_name varchar(50)  NOT NULL,
                            email varchar(50)  NOT NULL,
                            registration_date date  NOT NULL,
                            qualification varchar(200)  NOT NULL,
                            introduction_brief varchar(1000)  NOT NULL,
                            num_of_published_courses int  NOT NULL,
                            num_of_enrolled_students int  NOT NULL,
                            average_review_rating int  NOT NULL,
                            num_of_reviews int  NOT NULL,
                            CONSTRAINT instructor_pk PRIMARY KEY (id)
) ;

-- Table: language
CREATE TABLE language (
                          id int  NOT NULL auto_increment,
                          language_name varchar(50)  NOT NULL,
                          CONSTRAINT language_pk PRIMARY KEY (id)
) ;

-- Table: learning_progress
CREATE TABLE learning_progress (
                                   id int  NOT NULL auto_increment,
                                   enrollment_id int  NOT NULL,
                                   course_chapter_content_id int  NOT NULL,
                                   begin_timestamp timestamp  NOT NULL,
                                   completion_timestamp timestamp  NOT NULL,
                                   status char(1)  NOT NULL,
                                   CONSTRAINT learning_progress_pk PRIMARY KEY (id)
) ;

-- Table: student
CREATE TABLE student (
                         id int  NOT NULL auto_increment,
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

-- Insert into Language
INSERT INTO language (id, language_name) VALUES (1, 'English');
INSERT INTO language (id, language_name) VALUES (2, 'Hindi');

-- Insert into Instructor
INSERT INTO instructor (id, first_name, last_name, email, registration_date, qualification, introduction_brief, num_of_published_courses, num_of_enrolled_students,average_review_rating,num_of_reviews) 
VALUES (1, 'Shubham', 'Saxena', 'shubham@gmail.com', '2021-03-17', 'M.Tech Computers', 'Govt Employee', '5', '20', '4.5', '10');
INSERT INTO instructor (id, first_name, last_name, email, registration_date, qualification, introduction_brief, num_of_published_courses, num_of_enrolled_students,average_review_rating,num_of_reviews) 
VALUES (2, 'Shivani', 'Saxena', 'shivani@gmail.com', '2021-03-18', 'B.Tech IT', 'IT Employee', '15', '20', '3.5', '20');
INSERT INTO instructor (id, first_name, last_name, email, registration_date, qualification, introduction_brief, num_of_published_courses, num_of_enrolled_students,average_review_rating,num_of_reviews) 
VALUES (3, 'Shalu', 'Choudhary', 'shalu@gmail.com', '2021-03-19', 'Msc', 'Teacher', '25', '20', '1.5', '30');
INSERT INTO instructor (id, first_name, last_name, email, registration_date, qualification, introduction_brief, num_of_published_courses, num_of_enrolled_students,average_review_rating,num_of_reviews) 
VALUES (4, 'Rahul', 'Choudhary', 'rahul@gmail.com', '2021-03-20', 'B.Tech Computers', 'IT Employee', '5', '20', '2.5', '10');
INSERT INTO instructor (id, first_name, last_name, email, registration_date, qualification, introduction_brief, num_of_published_courses, num_of_enrolled_students,average_review_rating,num_of_reviews) 
VALUES (5, 'Kuldeep', 'Malik', 'kuldeep@gmail.com', '2021-03-21', 'B.Tech Mechanical', 'Mechanical Employee', '5', '20', '3.5', '20');
INSERT INTO instructor (id, first_name, last_name, email, registration_date, qualification, introduction_brief, num_of_published_courses, num_of_enrolled_students,average_review_rating,num_of_reviews) 
VALUES (6, 'Varun', 'Khanna', 'varun@gmail.com', '2021-03-22', 'B.Tech IT', 'IT Employee', '35', '20', '4.5', '30');
INSERT INTO instructor (id, first_name, last_name, email, registration_date, qualification, introduction_brief, num_of_published_courses, num_of_enrolled_students,average_review_rating,num_of_reviews) 
VALUES (7, 'Shubham', 'Jain', 'shubham@gmail.com', '2021-03-23', 'B.Tech IT', 'IT Employee', '45', '20', '1.5', '10');
INSERT INTO instructor (id, first_name, last_name, email, registration_date, qualification, introduction_brief, num_of_published_courses, num_of_enrolled_students,average_review_rating,num_of_reviews) 
VALUES (8, 'Krishna', 'Mohan', 'krishna@gmail.com', '2021-03-24', 'B.Tech Computers', 'IT Employee', '55', '20', '2.5', '20');
INSERT INTO instructor (id, first_name, last_name, email, registration_date, qualification, introduction_brief, num_of_published_courses, num_of_enrolled_students,average_review_rating,num_of_reviews) 
VALUES (9, 'Ashu', 'Choudhary', 'ashu@gmail.com', '2021-03-25', 'B.Tech Computers', 'IT Employee', '65', '20', '3.5', '30');
INSERT INTO instructor (id, first_name, last_name, email, registration_date, qualification, introduction_brief, num_of_published_courses, num_of_enrolled_students,average_review_rating,num_of_reviews) 
VALUES (10, 'Shubham', 'Agarwal', 'shubham@gmail.com', '2021-03-26', 'B.Tech Electronics', 'IT Employee', '75', '20', '4.5', '10');


-- insert into Students
INSERT INTO student (id, first_name, last_name, email, registration_date, num_of_courses_enrolled, num_of_courses_completed) 
VALUES (1, 'Akash', 'Gupta', 'akash@gmail.com', '2021-03-17', '10', '5');
INSERT INTO student (id, first_name, last_name, email, registration_date, num_of_courses_enrolled, num_of_courses_completed) 
VALUES (2, 'Lohit', 'Saxena', 'lohit@gmail.com', '2021-03-18', '10', '15');
INSERT INTO student (id, first_name, last_name, email, registration_date, num_of_courses_enrolled, num_of_courses_completed) 
VALUES (3, 'Ramu', 'Vinnakota', 'ramu@gmail.com', '2021-03-19', '10', '25');
INSERT INTO student (id, first_name, last_name, email, registration_date, num_of_courses_enrolled, num_of_courses_completed) 
VALUES (4, 'Srinivas', 'Singh', 'srinivas@gmail.com', '2021-03-20', '10', '35');
INSERT INTO student (id, first_name, last_name, email, registration_date, num_of_courses_enrolled, num_of_courses_completed) 
VALUES (5, 'Rohit', 'Pundir', 'rohit@gmail.com', '2021-03-17', '21', '45');
INSERT INTO student (id, first_name, last_name, email, registration_date, num_of_courses_enrolled, num_of_courses_completed) 
VALUES (6, 'Anil', 'Wadnapar', 'anil@gmail.com', '2021-03-17', '22', '55');
INSERT INTO student (id, first_name, last_name, email, registration_date, num_of_courses_enrolled, num_of_courses_completed) 
VALUES (7, 'Dheeraj', 'Kumar', 'dheeraj@gmail.com', '2021-03-17', '23', '25');
INSERT INTO student (id, first_name, last_name, email, registration_date, num_of_courses_enrolled, num_of_courses_completed) 
VALUES (8, 'Akshay', 'Saxena', 'akshay@gmail.com', '2021-03-17', '24', '35');
INSERT INTO student (id, first_name, last_name, email, registration_date, num_of_courses_enrolled, num_of_courses_completed) 
VALUES (9, 'Ashish', 'Chaturvedi', 'ashish@gmail.com', '2021-03-17', '25', '45');
INSERT INTO student (id, first_name, last_name, email, registration_date, num_of_courses_enrolled, num_of_courses_completed) 
VALUES (10, 'Diksha', 'Trivedi', 'diksha@gmail.com', '2021-03-17', '26', '65');

-- Insert into Course
INSERT INTO course (id, course_title, course_brief, instructor_id, num_of_chapters, course_fee, language_id) 
VALUES (1, 'Java', 'Intro to Java', '1', '10', '1200', '1');
INSERT INTO course (id, course_title, course_brief, instructor_id, num_of_chapters, course_fee, language_id) 
VALUES (2, 'JavaScript', 'Intro to JavaScript', '2', '10', '1300', '1');
INSERT INTO course (id, course_title, course_brief, instructor_id, num_of_chapters, course_fee, language_id) 
VALUES (3, 'Python', 'Intro to Python', '3', '10', '1400', '1');
INSERT INTO course (id, course_title, course_brief, instructor_id, num_of_chapters, course_fee, language_id) 
VALUES (4, 'C', 'Intro to C', '4', '4', '1200', '1');
INSERT INTO course (id, course_title, course_brief, instructor_id, num_of_chapters, course_fee, language_id) 
VALUES (5, 'Ruby', 'Intro to Ruby', '5', '5', '1500', '1');
INSERT INTO course (id, course_title, course_brief, instructor_id, num_of_chapters, course_fee, language_id) 
VALUES (6, 'C++', 'Intro to C++', '6', '6', '1600', '1');
INSERT INTO course (id, course_title, course_brief, instructor_id, num_of_chapters, course_fee, language_id) 
VALUES (7, 'Spring', 'Intro to Spring', '7', '7', '1700', '1');
INSERT INTO course (id, course_title, course_brief, instructor_id, num_of_chapters, course_fee, language_id) 
VALUES (8, 'NodeJS', 'Intro to NodeJS', '8', '8', '1800', '1');
INSERT INTO course (id, course_title, course_brief, instructor_id, num_of_chapters, course_fee, language_id) 
VALUES (9, 'Angular', 'Intro to Angular', '9', '9', '1900', '1');
INSERT INTO course (id, course_title, course_brief, instructor_id, num_of_chapters, course_fee, language_id) 
VALUES (10, 'ReactJS', 'Intro to ReactJS', '10', '10', '1500', '1');
INSERT INTO course (id, course_title, course_brief, instructor_id, num_of_chapters, course_fee, language_id) 
VALUES (11, 'Docker', 'Intro to Docker', '1', '10', '1200', '1');
INSERT INTO course (id, course_title, course_brief, instructor_id, num_of_chapters, course_fee, language_id) 
VALUES (12, 'Android', 'Intro to Android', '2', '10', '1200', '1');
INSERT INTO course (id, course_title, course_brief, instructor_id, num_of_chapters, course_fee, language_id) 
VALUES (13, 'MySQL', 'Intro to MySQL', '3', '10', '1200', '1');
INSERT INTO course (id, course_title, course_brief, instructor_id, num_of_chapters, course_fee, language_id) 
VALUES (13, 'MySQL', 'Intro to MySQL', '4', '10', '1200', '1');

-- Insert into Enrollment
INSERT INTO enrollment (id, student_id, course_id, enrollment_date, is_paid_subscription) 
VALUES (1, '1', '1', '2021-03-18', '1');
INSERT INTO enrollment (id, student_id, course_id, enrollment_date, is_paid_subscription) 
VALUES (2, '2', '2', '2021-03-18', '1');
INSERT INTO enrollment (id, student_id, course_id, enrollment_date, is_paid_subscription) 
VALUES (3, '3', '3', '2021-03-18', '1');
INSERT INTO enrollment (id, student_id, course_id, enrollment_date, is_paid_subscription) 
VALUES (4, '4', '4', '2021-03-18', '1');
INSERT INTO enrollment (id, student_id, course_id, enrollment_date, is_paid_subscription) 
VALUES (5, '5', '5', '2021-03-18', '1');
INSERT INTO enrollment (id, student_id, course_id, enrollment_date, is_paid_subscription) 
VALUES (6, '6', '6', '2021-03-18', '1');
INSERT INTO enrollment (id, student_id, course_id, enrollment_date, is_paid_subscription) 
VALUES (7, '7', '7', '2021-03-18', '1');
INSERT INTO enrollment (id, student_id, course_id, enrollment_date, is_paid_subscription) 
VALUES (8, '8', '8', '2021-03-18', '1');
INSERT INTO enrollment (id, student_id, course_id, enrollment_date, is_paid_subscription) 
VALUES (9, '9', '9', '2021-03-18', '1');
INSERT INTO enrollment (id, student_id, course_id, enrollment_date, is_paid_subscription) 
VALUES (10, '10', '10', '2021-03-18', '1');
INSERT INTO enrollment (id, student_id, course_id, enrollment_date, is_paid_subscription) 
VALUES (11, '1', '2', '2021-03-18', '1');
INSERT INTO enrollment (id, student_id, course_id, enrollment_date, is_paid_subscription) 
VALUES (12, '2', '1', '2021-03-18', '1');
-- End of file.



