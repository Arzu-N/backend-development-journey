package org.example.soappp.Bean;

public class User {
    private Integer id;
    private String name;
    private String surname;

    public User(Integer id,String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
public Integer getId(){
        return id;
}
public User setid(Integer id){
        this.id=id;
        return this;
}
    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public User setSurname(String surname) {
        this.surname = surname;
        return this;
    }
}
