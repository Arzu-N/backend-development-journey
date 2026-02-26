package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args)  {
        Connection con=null;
        try{
            DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?user=postgres&password=arzu12&characterEncoding=utf-8");
            System.out.println("Connected to PostgreSQL");
        }

         catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally{
            try{
            if(con!=null)
               con.close();
            }
            catch(SQLException e){
                e.printStackTrace();
            }

                }
    }
}