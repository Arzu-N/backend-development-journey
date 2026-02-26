package Monday;

import java.util.Scanner;

public class Parol {
    public static void main(String[]args) {
        String s = new Scanner(System.in).nextLine();
        System.out.println(validate(s));
    }

    public static String validate(String password) {
        int score = 0;
        boolean upper = false;
        boolean lower = false;
        boolean digit = false;
        boolean special = false;
        if (password.length() >= 8) {
            score++;
        }
        for (char p : password.toCharArray()) {
            if (Character.isUpperCase(p)) {
                upper = true;
            } else if (Character.isLowerCase(p)) {
                lower = true;
            } else if (Character.isDigit(p)) {
                digit = true;
            } else if ("!@$%^&*".contains(String.valueOf(p))) {
                special = true;
            }
        }
        if (upper) score++;
        if (lower) score++;
        if (digit) score++;
        if (special) score++;
        if (score <= 2) return "zeif parol";
        else if (score <= 4) return "orta parol";
        else return "guclu parol";
    }
}



