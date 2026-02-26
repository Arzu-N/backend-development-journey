package org.example;

public class EBook extends Book {
    int fileSize;
    EBook(int fileSize,String title,String author){
        super(title,author);
        this.fileSize=fileSize;
    }
    @Override
    void info(){
        System.out.println(title+" Ebook "+fileSize);
    }
}
