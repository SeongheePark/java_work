package ch01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest_Ex {
	
	private static final String USERNAME = "root";
	private static final String PASSWORD = "1234";
	private static final String URL = "jdbc:mysql://localhost:3306/mydb?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
	
	static Connection conn;
	static Statement stmt;
	static ResultSet rs;
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			stmt = conn.createStatement();
			
			String sql = "SELECT * FROM customer;";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String address = rs.getString("address");
				System.out.println(id+" "+name+" "+email+" "+address);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
