import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Tcpserver {
    public static void main(String[] args) throws IOException {
//readasbyte();
        readasstring();
    }
    public static void  readasbyte() throws IOException {
        ServerSocket serversocket=new ServerSocket(6789);
        while(true){
            System.out.println("yeni musteri gozlenilir");
        Socket accept = serversocket.accept();
        InputStream inputStream = accept.getInputStream();
        DataInputStream datastream=new DataInputStream(inputStream);
        byte[] arr1=readasmessage(datastream);
Files.write(Paths.get("arzu.jpeg"),arr1);
    }}
    public static byte[] readasmessage(DataInputStream d) throws IOException {
        int len = d.readInt();
        byte[]arr=new byte[len];
        d.readFully(arr);
        return arr;
    }
    public static void readasstring() throws IOException {
        ServerSocket serversocket=new ServerSocket(6789);
        while(true){
            Socket accept = serversocket.accept();
            InputStream inputStream = accept.getInputStream();
            InputStreamReader is=new InputStreamReader(inputStream);
            BufferedReader br=new BufferedReader(is);
            String s = br.readLine();
            System.out.println("musreti deyirki: "+ s);
        }
    }
}