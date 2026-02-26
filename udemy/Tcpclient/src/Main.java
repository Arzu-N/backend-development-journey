import com.sun.xml.internal.bind.api.impl.NameConverter;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
Socket socket=new Socket("192.168.72.148",6789);
        OutputStream outputStream = socket.getOutputStream();

       // byte[] bytes = Files.readAllBytes(Paths.get("C:/Users/Lenovo/Pictures/arzu.jpeg"));
        byte[]bytes=("Salam,necesen?").getBytes(StandardCharsets.UTF_8);
        DataOutputStream datastream=new DataOutputStream(outputStream);
        datastream.writeInt(bytes.length);
datastream.write(bytes);
socket.close();
    }
}