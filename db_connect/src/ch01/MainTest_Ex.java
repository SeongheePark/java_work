package ch01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainTest_Ex {
	static Connection conn;
	static Statement stmt;
	static ResultSet rs;
	
	public static void main(String[] args) {
		DBClient client = new DBClient();
		conn = client.getConnection();
		
		try {
			stmt = conn.createStatement();
			String sql = "select * from movie";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("title");
				String director = rs.getString("director");
				System.out.println(id+" "+title+" "+director);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
