import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;




 public class DAO {


     public Connection conn;

     boolean open() {
         try {
             String userName = "root";
             String password = "root";
             String url = "jdbc:mysql://localhost:3306/testing?useSSL=false";
             //// "jdbc:mysql://localhost/test";
             Class.forName("com.mysql.jdbc.Driver").newInstance();
             conn = DriverManager.getConnection(url, userName, password);
             System.out.println("CONNECTED");
             return true;
         } catch (Exception e) {
             System.out.println(e.getMessage());
             System.err.println("NOT connected");
             return false;
         }

     }

     void close() {
         if (conn != null) {
             try {
                 conn.close();
             } catch (Exception e) {
             }
         }
     }


     public void fillTestData() {
         try {
             Statement statement = conn.createStatement();
             String query = "SELECT * FROM users ";
             ResultSet rs = statement.executeQuery(query);
             while (rs.next()) {
                 int id = rs.getInt("userid");
                 String name1 = rs.getString("name");
                 String sureName1 = rs.getString("sureName");
                 System.out.println(id + "\t| " + name1 + "\t| " + sureName1);


             }

         } catch (Exception e) {
             System.out.println(e.getMessage());
         }

     }


     public void fillTestData2() {
         try {
             Statement statement = conn.createStatement();
             String query = "SELECT * FROM account ";
             ResultSet rs = statement.executeQuery(query);
             while (rs.next()) {
                 int id = rs.getInt("accountid");
                 String account1 = rs.getString("account");
                 String userid1 = rs.getString("userid");
                 System.out.println(id + "\t| " + account1 + "\t| " + userid1);


             }

         } catch (Exception e) {
             System.out.println(e.getMessage());
         }

     }
 }


