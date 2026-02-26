package org.example;

public class Student {
    String name;

    int[]marks;
    Student(String name,int[] marks){
        this.name=name;
        this.marks=marks;
    }
    double average(){
        int o=0;
        int count=0;
        count++;
        for(int a:marks){
            o+=a;
        }
        o=o/count;
        return o;
    }
}
