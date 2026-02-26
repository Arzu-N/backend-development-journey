package com.example.educationnwebapp;

public class TestMySQLDriver {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("driver isleyir");
        }
        catch(ClassNotFoundException e){
            System.out.println("driver islemedi");
            e.printStackTrace();
        }
    }
}
