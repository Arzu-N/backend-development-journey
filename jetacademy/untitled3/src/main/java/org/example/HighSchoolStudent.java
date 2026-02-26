package org.example;

public class HighSchoolStudent extends Student {
    int extra_credit;
    HighSchoolStudent(String name,int[]marks,int extra_credit){
        super(name,marks);
        this.extra_credit=extra_credit;
    }
    @Override
    double average(){
       return  super.average()+extra_credit;
    }
}
