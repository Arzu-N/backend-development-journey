package org.example;

public class Polindrom {
    public static Boolean a(String a){
        String rev="";
        int l=a.length();
        for(int i=l-1;i>=0;i--){
            rev+=a.charAt(i);
        }
        return rev.equals(a);
    }
}
