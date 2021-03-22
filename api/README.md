# elearning

1. For Entity : JPA Support Plugin
2. Right click on left panel anywhere -> new -> Generate Jpa Entities
3. Provide Connection Details
4. Provide Entity and Repository Path
5. Select Tables
6. Generate
7. For Pojo : Pojo Generator Plugin
8. Select all tables in 1 go -> right click -> Pojo Generator -> DTO

Note :
We need to add the relationship manually

watch curl -d '{
"courseTitle": "Introduction to Java",
"courseBrief": "Deep Understanding of how Java works behind the scen",
"instructor": {
"id": "1"
},
"numOfChapters": "10",
"courseFee": "300",
"language": {
"id": 1
}

}' -H 'Content-Type: application/json' POST http://localhost:8080/api/elearning/v1/courses

OR 

curl -H "Content-Type: application/json" -X POST -d '{
"courseTitle": "Introduction to Java",
"courseBrief": "Deep Understanding of how Java works behind the scen",
"instructor": {
"id": "1"
},
"numOfChapters": "10",
"courseFee": "300",
"language": {
"id": 1
}
}' http://localhost:8080/api/elearning/v1/courses


Joins :
-------
One To Many
-- Instructor to Courses is 1 to Many

-- Sub Query
select * from course where course.instructor_id = (select instructor.id from instructor where instructor.first_name='Shubham' and instructor.last_name='Saxena');

-- Inner Join ( Common in both )
select first_name, last_name, course_title from instructor inner join course on instructor.id = course.instructor_id;

-- Left Join ( All from Left and mapping from right )
select first_name, last_name, course_title from instructor left join course on instructor.id = course.instructor_id;

select instructor.first_name, instructor.last_name, instructor.registration_date , course.course_title, count(*) as Course
from instructor
inner join course on instructor.id = course.instructor_id
group by instructor.id
order by instructor.registration_date;

-- Right Join ( All from right and mapping from left)
select first_name, last_name, course_title from instructor right join course on instructor.id = course.instructor_id;


Many To Many

select distinct student.first_name,student.last_name
from student
inner join enrollment on student.id = enrollment.student_id;

select distinct course.course_title
from course
inner join enrollment on course.id = enrollment.course_id;

select distinct student.first_name,student.last_name,course.course_title
from enrollment
inner join course on course.id = enrollment.course_id
inner join student on student.id = enrollment.student_id;
