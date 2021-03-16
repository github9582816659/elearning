package com.elearning.entity.dto;

public class StudentDTO {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private java.sql.Date registrationDate;
    private Integer numOfCoursesEnrolled;
    private Integer numOfCoursesCompleted;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public java.sql.Date getRegistrationDate() {
        return this.registrationDate;
    }

    public void setRegistrationDate(java.sql.Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Integer getNumOfCoursesEnrolled() {
        return this.numOfCoursesEnrolled;
    }

    public void setNumOfCoursesEnrolled(Integer numOfCoursesEnrolled) {
        this.numOfCoursesEnrolled = numOfCoursesEnrolled;
    }

    public Integer getNumOfCoursesCompleted() {
        return this.numOfCoursesCompleted;
    }

    public void setNumOfCoursesCompleted(Integer numOfCoursesCompleted) {
        this.numOfCoursesCompleted = numOfCoursesCompleted;
    }
}
