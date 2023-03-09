package ch04;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BuyDAO implements IBuyDAO {
	private DBClient dbClient;

	public BuyDAO() {
		initData();
	}

	private void initData() {
		dbClient = new DBClient();
	}

	@Override
	public ArrayList<BuyDTO> select() {
		ArrayList<BuyDTO> list = new ArrayList<>();

		Connection conn = dbClient.getConnection();
		Statement stmt = null;
		ResultSet rs = null;

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM buytbl ");

			while (rs.next()) {
				String username = rs.getString("username");
				String prodName = rs.getString("prodName");
				int price = rs.getInt("price");
				int amount = rs.getInt("amount");

				BuyDTO dto = new BuyDTO(username, prodName, price, amount);
				list.add(dto);
			}
		} catch (Exception e) {
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

		return list;
	}

	@Override
	public int insert(BuyDTO dto) {
		String sqlFormat = "INSERT INTO " + "buytbl(username, prodName, price, amount) " + "VALUES('%s','%s',%d,%d) ";
		String sql = String.format(sqlFormat, dto.getUsername(), dto.getProdName(), dto.getPrice(), dto.getAmount());
		Connection conn = dbClient.getConnection();
		Statement stmt = null;
		int resultRowCount = 0;
		try {
			stmt = conn.createStatement();
			resultRowCount = stmt.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return resultRowCount;
	}

	@Override
	public int update(BuyDTO dto, String targetProdName, String targetUserName) {
		String sqlFormat = "UPDATE buytbl " + "SET prodName = '%s', price = '%d', amount = '%d' "
				+ "WHERE prodName = '%s' AND username = '%s';";
		String sql = String.format(sqlFormat, dto.getProdName(), dto.getPrice(), dto.getAmount(), targetProdName,
				targetUserName);
		int resultRow = 0;
		Connection conn = dbClient.getConnection();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			resultRow = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return resultRow;
	}

	@Override
	public void delete(String username) {
		String sqlFormat = "DELETE FROM buytbl " + "WHERE username = '%s' ";
		String sql = String.format(sqlFormat, username);
		Connection conn = dbClient.getConnection();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
