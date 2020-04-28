package com.kcs.students.app.dto;

import java.util.Objects;

public class Student {
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;


    public Student(int id, String firstname, String lastname, String email, String phone) {

        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
    }
    public Student() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return firstname.equals(student.firstname) &&
                lastname.equals(student.lastname) &&
                email.equals(student.email) &&
                phone.equals(student.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, email, phone);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
