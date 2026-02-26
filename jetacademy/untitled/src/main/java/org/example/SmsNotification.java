package org.example;

public class SmsNotification extends Notification
{
    SmsNotification(String sms) {
        super(sms);
    }
    @Override
     void send() {
        System.out.println(sms);

    }}
