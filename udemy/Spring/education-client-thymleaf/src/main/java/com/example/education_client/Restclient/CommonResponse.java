package com.example.education_client.Restclient;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.List;

public class CommonResponse {
private List<StudentResponse> obj;
private String message;
private LocalDateTime datetime;

    public List<StudentResponse> getObj() {
        return obj;
    }

    public CommonResponse setObj(List<StudentResponse> obj) {
        this.obj = obj;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public CommonResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public CommonResponse setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
        return this;
    }
    public static class StudentResponse {
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

        public StudentResponse setId(Integer id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public StudentResponse setName(String name) {
            this.name = name;
            return this;
        }

        public String getSurname() {
            return surname;
        }

        public StudentResponse setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Integer getAge() {
            return age;
        }

        public StudentResponse setAge(Integer age) {
            this.age = age;
            return this;
        }

        public String getPassword() {
            return password;
        }

        public StudentResponse setPassword(String password) {
            this.password = password;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public StudentResponse setEmail(String email) {
            this.email = email;
            return this;
        }

        public UniversityDTO getUniversity() {
            return university;
        }

        public StudentResponse setUniversity(UniversityDTO university) {
            this.university = university;
            return this;
        }
    }
    public static class UniversityDTO {
        private Integer id;
        private String name;

        public Integer getId() {
            return id;
        }

        public UniversityDTO setId(Integer id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public UniversityDTO setName(String name) {
            this.name = name;
            return this;
        }
    }
}
