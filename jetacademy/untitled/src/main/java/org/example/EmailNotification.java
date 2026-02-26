package org.example;

public class EmailNotification extends Notification{
    public EmailNotification(String sms) {
        super(sms);
    }
    @Override
    void send(){
        System.out.println(sms);

    }
}
