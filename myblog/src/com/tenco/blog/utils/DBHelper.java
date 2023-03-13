package com.tenco.blog.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
	private static final String DB_HOST = "localhost";
	private static final String DB_PORT = "3306";
	private static final String DB_DATABASE_NAME = "myblog";
	private static final String DB_CHARSET = "UTF-8";
	private static final String DB_USER = "bloguser";
	private static final String DB_PASSWORD = "1Q2W3E4R5T";

	// 접근 주체
	private Connection conn;

	public Connection getConnection() {
		if (conn == null) {
			// 한번도 생성하지 않았다면 동작
			String urlFormat = "jdbc:mysql://%s:%s/%s?serverTimezone=Asia/Seoul&characterEncoding=%s";
			String url = String.format(urlFormat, DB_HOST, DB_PORT, DB_DATABASE_NAME, DB_CHARSET);
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(url, DB_USER, DB_PASSWORD);
				System.out.println(">> DB 연결 완료 <<");

			} catch (Exception e) {
				System.out.println(">>DBHelper에서 오류 발생<<");
				e.printStackTrace();
			}
		}
		return conn;
	}

	public void closeConnection() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		conn = null; // 가비지컬렉터 제거 대상이 된다.
	}
}
