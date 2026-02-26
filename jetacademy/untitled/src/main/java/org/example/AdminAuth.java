package org.example;

public class AdminAuth extends Auth{
    @Override
    public boolean authenticate(String username, String password){
        return(username.equals("admin") && password.equals("1234"));


    }
}
