package com.example.educationnwebapp.common;
import java.io.Serializable;
public class Person implements Serializable {
    private static final long serialversionUIO=1L;
    private int id;
private String name;
private String surname;
private Integer age;
public  String password;
private String email;

    public int getId() {
        return id;
    }

    public Person setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Person setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Person setAge(Integer age) {
        this.age = age;
        return this;
    }
        public String getEmail() {
        return email;
    }

    public Person setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public String toString(){
        return name+" "+surname+" "+age;
    }
}
