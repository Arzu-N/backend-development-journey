package org.example;

public class PrintedBook extends Book{
    int pageCount;
    PrintedBook(int pageCount, String title, String author){
        super(title,author);
        this.pageCount=pageCount;
    }
    @Override
    void info(){
        System.out.println(title+" Printedbook "+pageCount);
    }
}
