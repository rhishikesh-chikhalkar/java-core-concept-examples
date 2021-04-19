package JDBC;

import java.sql.*;
import java.util.Scanner;

public class SqlQuerySelector {
    public static void main(String args[]) {

        do {
            System.out.println("\n\n1. Insert");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. Show Data");
            System.out.println("5. Exit");
            System.out.print("Enter your choice = \t");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
            case 1:
                // Execute query - prepare statement - insert
                try {
                    Class.forName("com.mysql.jdbc.Driver"); // loads our driver class from jar
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
                    PreparedStatement ps = con
                            .prepareStatement("insert into student(name,email,password) values (?,?,?)");
                    System.out.println("\nStatement Created.");
                    ps.setString(1, "vaibhav");
                    ps.setString(2, "vaibhav@gmail.com");
                    ps.setString(3, "910");
                    ps.executeUpdate();
                    con.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;

            case 2:
                // Execute query - prepare statement - UPDATE
                try {
                    Class.forName("com.mysql.jdbc.Driver"); // loads our driver class from jar
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
                    PreparedStatement ps = con
                            .prepareStatement("UPDATE student set name=?,email=?,password=? where id=?");
                    System.out.println("\nStatement Created.");
                    ps.setString(1, "ashu");
                    ps.setString(2, "ashu@gmail.com");
                    ps.setString(3, "811");
                    ps.setInt(4, 6);
                    ps.executeUpdate();
                    con.close();
                } catch (Exception e) {
                    System.out.println(e);
                }

                break;

            case 3:
                // Execute query - prepare statement - delete
                try {
                    Class.forName("com.mysql.jdbc.Driver"); // loads our driver class from jar
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
                    PreparedStatement ps = con.prepareStatement("DELETE FROM student WHERE id=?");
                    System.out.println("\nStatement Created.");
                    ps.setInt(1, 7);
                    ps.executeUpdate();
                    con.close();
                } catch (Exception e) {
                    System.out.println(e);
                }

                break;
            case 4:
                // Execute query - create statement - select
                try {

                    Class.forName("com.mysql.jdbc.Driver"); // loads our driver class from jar
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");

                    // Connection con=GiveConnection.createObj();
                    Statement stmt = con.createStatement();
                    System.out.println("\nstatement created");
                    String query = "select * from student order by id asc";
                    ResultSet rs = stmt.executeQuery(query); // select stmnts
                    while (rs.next()) {
                        System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  "
                                + rs.getString(4));
                    }
                    con.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;
            case 5:
                System.exit(0);
                break;

            default:
                System.out.println("\nInvalid Input.");
                break;
            }

        } while (true);
    }

}
