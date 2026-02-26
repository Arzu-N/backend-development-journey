package com.example.education.DTO;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
@Data
public class StudentDTO {
    private Integer id;
    private String name;
    @JsonProperty("surname")
    private String surname;
    private Integer age;
    private  String password;
    private String email;
    private UniversityDTO university;
}*/
public class StudentDTO {
    private Integer id;
    private String name;
    @JsonProperty("surname")
    private String surname;
    private Integer age;
    private  String password;
    private String email;
    private UniversityDTO university;

    public Integer getId() {
        return id;
    }

    public StudentDTO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public StudentDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public StudentDTO setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public StudentDTO setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public StudentDTO setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public StudentDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public UniversityDTO getUniversity() {
        return university;
    }

    public StudentDTO setUniversity(UniversityDTO university) {
        this.university = university;
        return this;
    }
}