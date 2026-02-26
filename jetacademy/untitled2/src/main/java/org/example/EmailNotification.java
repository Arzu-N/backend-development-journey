package org.example;

public class EmailNotification extends Notification{
    EmailNotification(String message){
        super(message);
    }
    @Override
    void send(){
        System.out.println("Email "+message);
    }
}
