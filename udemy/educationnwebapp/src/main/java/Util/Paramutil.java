package Util;

public class Paramutil {
    public static String get(String value){
        if(value!=null){
            return value;
        }
        return "";
    }
public static Integer Parseint(String value){
        if(value!=null&&value.length()>0){
            return Integer.parseInt(value.trim());
        }
        return null;
}
}
