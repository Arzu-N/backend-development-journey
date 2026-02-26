package org.example;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

import static org.example.Hibernateutil.getSessionFactory;

public class Main {
    public static void main(String[] args) {
        try(Session session = getSessionFactory().openSession()){
            Query<Student> query = session.createQuery("select s from Student s", Student.class);
            List<Student> resultList = query.getResultList();
            System.out.println(resultList);
            Hibernateutil.shutdown();
        }
}}