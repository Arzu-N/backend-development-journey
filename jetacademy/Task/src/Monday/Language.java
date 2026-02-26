package Monday;

import java.util.Scanner;

public enum Language {
    AZ("Java Wora prinsipine sahib oldugu ucun diger dillerden ferqlenir"),
    EN("Java differs from other languages because it has the wora principle"),
    RU("Java отличается от других языков тем, что в ней используется принцип wora."),
    UA("Java відрізняється від інших мов програмування тим, що в ній використовується принцип wora."),
    UK("Java membutuhkan waktu yang lama, dan tidak ada gunanya lagi di dunia.");
    private final String description;
    Language(String description) {
        this.description = description;
    }    public String getDescription() {
        return description;
    }    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        Language language = Language.valueOf(a);
        switch(language){
            case AZ:
                System.out.println(language.getDescription());
                break;
            case EN:
                System.out.println(language.getDescription());
                break;
            case RU:
                System.out.println(language.getDescription());
                break;
            case UA:
                System.out.println(language.getDescription());
                break;
            case UK:
                System.out.println(language.getDescription());
                break;
                    }
    }
}
