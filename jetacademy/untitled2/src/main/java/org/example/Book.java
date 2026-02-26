package org.example;

public class Book {
    String title;
    String author;
    Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    void info(){
        System.out.println(title+"-"+author);
    }
}
