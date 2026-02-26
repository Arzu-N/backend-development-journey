package com.example.education.entity;

public class Dto {

    private final String name;
    private final String surname;
    private final String fullname;
    public Dto(String name,String surname,String fullname){

        this.name=name;
        this.surname=surname;
        this.fullname=fullname;
    }



    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFullname() {
        return fullname;
    }
}
