package org.example;

public class UppercaseEncoder extends Encoder {
    @Override
    public void encode(String text){
        System.out.println(text.toUpperCase());
    }
}
