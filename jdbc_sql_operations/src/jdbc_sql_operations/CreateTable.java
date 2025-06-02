package jdbc_sql_operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_jdbc", "root", "admin");
			Statement stmt = con.createStatement();
			stmt.execute("CREATE TABLE student(id INT PRIMARY KEY, name VARCHAR(50), branch VARCHAR(50))");
			System.out.println("Table Created Successfully");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
