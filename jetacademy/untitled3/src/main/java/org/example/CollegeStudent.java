package org.example;

public class CollegeStudent extends Student{
    int projectScore;
    CollegeStudent(String name,int[]marks,int projectScore){
        super(name,marks);
        this.projectScore=projectScore;
    }
    @Override
    double average(){
        return super.average()+projectScore*0.1;
    }
}
