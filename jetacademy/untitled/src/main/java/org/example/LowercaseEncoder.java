package org.example;

public class LowercaseEncoder extends Encoder{
    @Override
    public void encode(String text){
        System.out.println(text.toLowerCase());
    }
}
