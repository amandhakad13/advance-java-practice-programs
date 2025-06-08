package jdbc_sql_operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecord {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_jdbc", "root", "admin");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("INSERT INTO student VALUES('105','Gourav','IT')");
			System.out.println("1 Record Insert Successfully");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
