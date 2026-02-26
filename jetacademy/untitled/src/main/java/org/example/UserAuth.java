package org.example;

public class UserAuth extends Auth{
    @Override
    public boolean authenticate(String username, String password){
        return username.equals("user") && password.equals("0000");
    }
}
