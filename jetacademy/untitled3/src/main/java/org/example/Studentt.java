package org.example;

public class Studentt {
    private String name;
    final static String university = "ADNSU";
    static int count = 0;

    public Studentt(String name) {
        this.name = name;
        System.out.println(name);
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
