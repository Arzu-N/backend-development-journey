import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
         final String url="jdbc:postgresql://localhost:5432/postgres";
         final String user="postgres";
         final String password="arzu12";
try{
    Connection connection = DriverManager.getConnection(url, user, password);
    System.out.println("Connected");
    connection.close();
}
catch(SQLException e){
    e.printStackTrace();
}
    }
}