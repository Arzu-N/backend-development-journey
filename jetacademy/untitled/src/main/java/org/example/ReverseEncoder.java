package org.example;

public class ReverseEncoder extends Encoder {
    @Override
    public void encode(String text){
        System.out.println(new StringBuilder(text).reverse().toString());
    }
}
