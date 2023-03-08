package ch01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBClient_Ex {
	private static final String DB_HOST = "localhost";
	private static final int DB_PORT = 3306;
	private static final String DB_NAME = "mydb";
	private static final String DB_CHARSET = "UTF-8";
	private static final String DB_USER_NAME = "root";
	private static final String DB_PASSWORD = "1234";
	
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	public DBClient_Ex() {
		
	}
	public Connection getConnection() {
		if (conn == null) {
			String urlFormat = "jdbc:mysql://%s:%d/%s?serverTimezone=Asia/Seoul&characterEncoding=%s";
			String url = String.format(urlFormat, DB_HOST,DB_PORT,DB_NAME,DB_CHARSET);
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(url,DB_USER_NAME,DB_PASSWORD);
				System.out.println("connection success");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
	public void connectionClose() {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
