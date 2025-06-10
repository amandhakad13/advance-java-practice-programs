package jdbc_prepared_statement_programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertRecord {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_jdbc", "root", "admin");
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO student VALUES (?,?,?)");
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter id : ");
			int n = sc.nextInt();
			System.out.print("Enter name : ");
			String s1 = sc.next();
			System.out.print("Enter branch : ");
			String s2 = sc.next();
			pstmt.setInt(1, n);
			pstmt.setString(2, s1);
			pstmt.setString(3, s2);
			pstmt.executeUpdate();
			System.out.println("Record Inserted Successfully");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
