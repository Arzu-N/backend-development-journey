package org.example;

public class Ortalama {
    public static  char hesabla(double a,double b,double c){
        double o= (a+b+c)/3;
        if(o>=0&&o<=50){
            System.out.println(o);
            return 'F';}
        else if(o>50&&o<=60){
            System.out.println(o);
            return 'E';}
        else if(o>60&&o<=70){
            System.out.println(o);
            return 'D';}
        else if(o>70&&o<=80){
            System.out.println(o);
            return 'C';}
        else if(o>80&&o<=90){
            System.out.println(o);
            return 'B';}
        else if(o>90&&o<=100){
            System.out.println(o);
            return 'A';}

        else
            return '0';
    }
}
