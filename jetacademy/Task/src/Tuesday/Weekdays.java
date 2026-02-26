package Tuesday;

import java.util.Scanner;

public class Weekdays {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
    switch(num){
        case 1:
            System.out.println(Weekday.MONDAY.getValue());
            break;
        case 2:
            System.out.println(Weekday.TUESDAY.getValue());
            break;
        case 3:
            System.out.println(Weekday.WEDNESDAY.getValue());
            break;
        case 4:
            System.out.println(Weekday.THURSDAY.getValue());
            break;
        case 5:
            System.out.println(Weekday.FRIDAY.getValue());
            break;
        case 6:
            System.out.println(Weekday.SATURDAY.getValue());
            break;
        case 7:
            System.out.println(Weekday.SUNDAY.getValue());
            break;
        default:
            System.out.println("Yalnis format");
    }

    }
}
enum Weekday{
    MONDAY("bazar ertesi"),
    TUESDAY("cersenbe axsami"),
    WEDNESDAY("Cersenbe"),
    THURSDAY("cume axsami"),
    FRIDAY("cume"),
    SATURDAY("senbe"),
    SUNDAY("bazar");
    private String value;
    Weekday(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
