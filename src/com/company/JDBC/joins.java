package JDBC;

import java.sql.*;

import javax.swing.JTextArea;

class joins {
    public static void main(String args[]) {

        // Execute query - prepare statement - insert
        try {
            Class.forName("com.mysql.jdbc.Driver"); // loads our driver class from jar
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
            Statement stmt = con.createStatement();
            System.out.println("Statement Created.");
            String query = "SELECT student.id,student.name,student.email,student.password,employee.salary FROM student INNER JOIN employee ON student.name = employee.name";
            ResultSet rs = stmt.executeQuery(query);
            JTextArea ta = new JTextArea(50, 20);
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getInt(4)
                        + "  " + rs.getInt(5));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        // Execute query - create statement - select
        try {

            Class.forName("com.mysql.jdbc.Driver"); // loads our driver class from jar
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");

            // Connection con=GiveConnection.createObj();
            Statement stmt = con.createStatement();
            System.out.println("statement created");
            String query = "select * from student order by id asc";
            ResultSet rs = stmt.executeQuery(query); // select stmnts
            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getString(4));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
