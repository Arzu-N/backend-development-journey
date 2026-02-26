package com.example.education.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

/*
@Entity(name="Mystudent")
@Table(name="student")
@NamedQuery(name="findbyname",query="Select s from Mystudent s where name=:name")
public class Student  {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String name;
    private String surname;
    private Integer age;
    public  String password;
    private String email;
    @ManyToOne(fetch= FetchType.LAZY,optional=false)
    @JoinColumn(name="university",nullable=false)
    @OnDelete(action= OnDeleteAction.CASCADE)
    @JsonIgnore
    private University university;
    @OneToOne
    private Address address;
    @ManyToMany
    @JoinTable(name="company_student",joinColumns=@JoinColumn(name="student_id"),inverseJoinColumns=@JoinColumn(name="company_id"))
private List<Company> companies;



    public Address getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public Student setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Student setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Student setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Student setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Student setPassword(String password) {
        this.password = password;
        return this;
    }

    public University getUniversity() {
        return university;
    }
    public Student setUniversity(University university) {
        this.university = university;
        return this;    }} */
/*@Entity(name="Mystudent")
        @Table(name="student")
@Getter
@Setter
        public class Student  {
            @Id
            @GeneratedValue(strategy=GenerationType.IDENTITY)
            private  Integer id;
            private String name;
            private String surname;
            private Integer age;
            private  String password;
            private String email;
            @ManyToOne(fetch= FetchType.LAZY,optional=false)
            @JoinColumn(name="universityid",nullable=false)
            @OnDelete(action= OnDeleteAction.CASCADE)
            private University university;

        }*/
@Entity(name="Mystudent")
@Table(name="student")
public class Student  {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private  Integer id;
    private String name;
    private String surname;
    private Integer age;
    private  String password;
    private String email;
    @ManyToOne(fetch= FetchType.LAZY,optional=false)
    @JoinColumn(name="universityid",nullable=false)
    @OnDelete(action= OnDeleteAction.CASCADE)
    private University university;

    public Integer getId() {
        return id;
    }

    public Student setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Student setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Student setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Student setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Student setEmail(String email) {
        this.email = email;
        return this;
    }

    public University getUniversity() {
        return university;
    }

    public Student setUniversity(University university) {
        this.university = university;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age
               ;
    }
}