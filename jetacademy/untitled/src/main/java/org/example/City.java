package org.example;

public class City {
    String name;
    int population;
    String country;
    public City(String name,int population,String country){
        this.name=name;
        this.population=population;
        this.country=country;
    }
    public String toString(){
        return this.name+" "+this.population+" "+this.country;
    }
}
