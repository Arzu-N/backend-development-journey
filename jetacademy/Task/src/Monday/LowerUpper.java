package Monday;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LowerUpper {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder p = new StringBuilder();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (Character.isLowerCase(c)) {
                p.append(String.valueOf(c).toUpperCase());
            } else {
                p.append(String.valueOf(c).toLowerCase());
            }

        }

        System.out.println(p);
        System.out.println(charArray);
        HashMap<Object, Object> map = new HashMap<>();
        Set<Map.Entry<Object, Object>> entries = map.entrySet();

    }


}
