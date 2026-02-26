package com.example.educationnwebapp.common;

import java.util.List;

public interface Commonrepo <T>{
    public List<T> getlist();
    public void insert(T obj);
    public void update(T obj);
    public void delete(Integer id);
public T findbiyid(int id);
public List<T>getlist(String name,String surname,String email,Integer age,String university,String password);
}
