package com.example.educationnwebapp.common;


import java.util.Scanner;

public abstract class Myservices extends Myservices2 {

    public void showmenu(){
        System.out.println("hansi emeliyyati etmek isteyirsiniz?");
        System.out.println("0.yuklemek\n"+"1.yenisini yaratmaq\n"+"2.yenilemek\n"+"3.silmek\n"+"4.axtarmaq\n"+"5.hamisini gormek\n");
        int action=new Scanner(System.in).nextInt();
        if(action==0){
            initialize();
        }
        else if(action==1){

            initializenew();
        }
        else if(action==2){
            update();
        }
        else if(action==3){
            delete();
        }
        else if(action==5){
            printall();
        }
        else if(action==4){
            find();
        }
    }
    public abstract  void printall();
    public abstract void initialize();
    public abstract void initializenew();
    public abstract void update();
    public  abstract void delete();
    public abstract void find();

}
