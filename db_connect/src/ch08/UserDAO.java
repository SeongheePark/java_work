package ch08;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

// 실제 DB 접근해서 기능을 처리
public class UserDAO implements IUserDAO {
	private DBHelper dbHelper;
	private Connection conn;
	// private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public UserDAO() {
		dbHelper = DBHelper.getInstance();
		conn = dbHelper.getConnection();
	}

	@Override
	public ArrayList<UserDTO> select() {
		ArrayList<UserDTO> list = new ArrayList<>();

		String sql = " SELECT * " + "FROM userTB " + "WHERE name = ? ";
		Scanner sc = new Scanner(System.in);
		
		try {
			pstmt = conn.prepareStatement(sql);
			String selectName = sc.next();
			pstmt.setString(1, selectName);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				UserDTO dto = new UserDTO();
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				dto.setGender(rs.getString("gender"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public int insert(UserDTO dto) {
		String sqlFormat = " INSERT INTO userTB(name, age, gender) " + "VALUES ('%s', '%d', '%s') ";
		String sql = String.format(sqlFormat, dto.getName(), dto.getAge(), dto.getGender());
		int resultRowCount = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			resultRowCount = pstmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return resultRowCount;
	}

	@Override
	public int update(UserDTO dto, int age, String name) {
		String sqlFormat = "UPDATE userTB " + "SET age = ? " + "WHERE name = ? ";
		String sql = String.format(sqlFormat, age, name);
		int resultRow = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			resultRow = pstmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return resultRow;
	}

	@Override
	public void delete(String name) {
		String sqlFormat = "DELETE FROM userTB " + "WHERE name = '%s' ";
		String sql = String.format(sqlFormat, name);
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}// end of class
