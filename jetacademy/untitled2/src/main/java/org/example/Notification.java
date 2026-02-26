package org.example;

public class Notification {
    String message;
    Notification(String message) {
        this.message=message;
    }
    void send(){
        System.out.println("Sending notification "+message);
    }
}
