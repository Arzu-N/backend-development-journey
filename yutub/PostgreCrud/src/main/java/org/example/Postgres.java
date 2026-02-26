package org.example;

import java.sql.*;

public class Postgres {
     final static String URL="jdbc:postgresql://localhost:5432/postgres";
     final static String USERNAME="postgres";
     final static String PASSWORD="arzu12";
    public  static Connection connect() {
     Connection con=null;
     try{
         con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        System.out.println("Connected to database successfully");
    }
     catch(SQLException e){
         e.printStackTrace();
    }
     return con;
}

public void insert(String name,String email,String password,String photo){
    String query="insert into users_data(name,email,password,photo) values(?,?,?,?)";
        try(Connection con=Postgres.connect();
            PreparedStatement pstm=con.prepareStatement(query);

                ){
            pstm.setString(1,name);
            pstm.setString(2,email);
            pstm.setString(3,password);
            pstm.setString(4,photo);
            pstm.execute();
            System.out.println("Inserted successfully");

        }
        catch(SQLException e){
            e.printStackTrace();
        }
}

public static void select(){
        String query="select *from users_data";
        try(
            Connection con=Postgres.connect();
            PreparedStatement preparedStatement = con.prepareStatement(query);)
        {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id")+" "+
                        resultSet.getString("name")+" "+
                        resultSet.getString("email")+" "+
                        resultSet.getString("password")+" "+
                        resultSet.getString("photo"));;
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
}

public static void update(int id,String name,String email,String password,String photo){
        String query="update users_data set name=?,email=?,password=?,photo=? where id=?";
        try(Connection con=Postgres.connect();
            PreparedStatement pstmt=con.prepareStatement(query);
        ){
            pstmt.setString(1,name);
            pstmt.setString(2,email);
            pstmt.setString(3,password);
            pstmt.setString(4,photo);
            pstmt.setInt(5,id);
            int a = pstmt.executeUpdate();
           if(a>0){
               System.out.println("Updated successfully");
           }

        }
        catch(SQLException e){
            e.printStackTrace();
        }
}

public static void delete(int id){
        String query="delete from users_data where id=?";
        try(
            Connection con=Postgres.connect();
            PreparedStatement pstmt = con.prepareStatement(query);
        ){
            pstmt.setInt(1,id);
            pstmt.execute();
        }
        catch(SQLException e){
            e.printStackTrace();
        }

}
}
