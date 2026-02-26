import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class UUIDD {
    public static void main(String[] args) {
        Supplier<String> s=()->UUID.randomUUID().toString();
        System.out.println( s.get());
    }
}
