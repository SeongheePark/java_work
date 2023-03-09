package ch01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MainTest2 {
	static Connection conn;
	static Statement stmt;
	static ResultSet rs;

	public static void main(String[] args) {
		// mydb 바꾸기
		DBClient.setDB_NAME("shopdb");
		ArrayList<BuyTBL> list = new ArrayList<>();
		DBClient dbClient = new DBClient();
		conn = dbClient.getConnection();
		// dbClient.setDB_NAME("shopdb"); -> static이라 클래스이름으로 사용하는 것을 권장.

		// DB 접근 구현 코드 처리
		// 자료구조 선언. 담을 데이터를 클래스로 모델링
		try {
			stmt = conn.createStatement();
			String sql = "select * from buyTBL";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				BuyTBL buyTBL = new BuyTBL(rs.getString("username"), rs.getString("prodName"), rs.getInt("price"),
						rs.getInt("amount"));
				list.add(buyTBL);
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
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	} // end of Main
	
}

class BuyTBL {
	private String username;
	private String prodName;
	private int price;
	private int amount;

	public BuyTBL(String username, String prodName, int price, int amount) {
		this.username = username;
		this.prodName = prodName;
		this.price = price;
		this.amount = amount;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "BuyTBL [username=" + username + ", prodName=" + prodName + ", price=" + price + ", amount=" + amount
				+ "]";
	}
	
}
