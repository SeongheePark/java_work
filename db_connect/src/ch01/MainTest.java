package ch01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainTest {
	static Connection conn;
	static Statement stmt;
	static ResultSet rs;

	public static void main(String[] args) {
		DBClient client = new DBClient();
		conn = client.getConnection();
		try {
			// 쿼리문 생성, 실행
			stmt = conn.createStatement();
			String queryStr = "SELECT * FROM student ";
			rs = stmt.executeQuery(queryStr); // 결과를 ResultSet 담김

			// 결과 뽑기
			while (rs.next()) {
				int id = rs.getInt("student_id");
				String name = rs.getString("student_name");
				String grade = rs.getString("grade");
				int schoolId = rs.getInt("school_id");
				System.out.print("id: " + id + "\t");
				System.out.print("name: " + name + "\t");
				System.out.print("grade: " + grade + "\t");
				System.out.print("schoolId: " + schoolId + "\t");
				System.out.println();
			}
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
