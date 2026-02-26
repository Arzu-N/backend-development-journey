package org.example;
public class Main {
    public static void main(String[] args) {
        Postgres postgres = new Postgres();
       // postgres.connect();
       //postgres.insert("Arzuu1","arzuuu@gmail.com","arzu1","arzu.png");
       // postgres.insert("Arzu","a@gmail.com","arzu1","arzu.png");
       // postgres.update(1,"Arzu","arzuuu@gmail.com","aaa","arzu.png");
     //   postgres.delete(8);
        Postgres.select();
    }
}