package com.company;
import java.sql.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","Akki");

        Statement s = con.createStatement();    //creating statement

        int rs = s.executeUpdate("update actor set first_name='Akki' where actor_id =2"); //executing statement

        /*while(rs.next()) {


            System.out.println(rs.get(1) + " " + rs.getString(2) +" "+ rs.getString(3));



        }*/

        con.close();
    }
}
