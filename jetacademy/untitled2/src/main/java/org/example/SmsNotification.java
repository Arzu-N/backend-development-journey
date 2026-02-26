package org.example;

public class SmsNotification extends Notification{
    SmsNotification(String message){
        super(message);
    }
    @Override
    void send(){
        System.out.println("Sms "+message);
    }
}
