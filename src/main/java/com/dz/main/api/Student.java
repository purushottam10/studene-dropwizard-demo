package com.dz.main.api;

import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.UUID;


public class Student extends Configuration implements Serializable {

    @NotNull
    private String id= UUID.randomUUID().toString();;
    private String firstName;
    private String lastName;
    private String marks;
    private long dob;
    @Email
    private String email;

    public Student() {
    }

    public Student(@NotNull String id, String firstName, String lastName, String marks, long dob, @Email String email) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.marks = marks;
        this.dob = dob;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public long getDob() {
        return dob;
    }

    public void setDob(long dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
