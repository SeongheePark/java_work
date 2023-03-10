package ch05;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// 실제 DB 접근해서 기능을 처리
public class EmployeeDAO implements IEmployeeDAO {
	private DBHelper dbHelper;
	private Connection conn;
	// private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public EmployeeDAO() {
		// 메서드 체이닝 방식
		// dbHelper.getConnection().createStatement().executeQuery(null);
		// dbHelper --> 싱글톤패턴이라 new 안됨
		// DBHelper 객체를 가지고 오는 동작
		dbHelper = DBHelper.getInstance();
		// DBHelper에서 connection 객체를 가지고 오는 동작
		conn = dbHelper.getConnection();

	} // end of EmployeeDAO

	@Override
	public ArrayList<EmployeeDTO> showTitleEmpInfo(String title) {
		ArrayList<EmployeeDTO> list = new ArrayList<>();

		String sql = " SELECT e.emp_no, e.first_name, e.last_name, t.title " + " FROM employees AS e "
				+ " INNER JOIN titles AS t " + " ON e.emp_no = t.emp_no " + " WHERE t.title = ? ";

		try {
			pstmt = conn.prepareStatement(sql);
			// preparedStatement 시작 번호는 1번부터 시작. ' ' 생략 가능 . 그냥 ? 기반으로 사용
			pstmt.setString(1, title);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				EmployeeDTO dto = new EmployeeDTO();
				dto.setEmpNo(rs.getString("emp_no"));
				dto.setFirstName(rs.getString("first_name"));
				dto.setLastName(rs.getString("last_name"));
				dto.setTitle(rs.getString("title"));
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

}// end of class
