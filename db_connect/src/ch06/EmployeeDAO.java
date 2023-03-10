package ch06;

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
	public ArrayList<EmployeeDTO> showTitleEmpInfo(String firstName, String lastName) {
		ArrayList<EmployeeDTO> list = new ArrayList<>();

		String sql = " SELECT *, count(salary) AS count " + "FROM employees AS e " + "LEFT JOIN salaries AS s "
				+ "ON e.emp_no = s.emp_no " + "GROUP BY e.emp_no " + "HAVING first_name = ? " + "	AND last_name = ? ";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, firstName);
			pstmt.setString(2, lastName);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmployeeDTO dto = new EmployeeDTO();
				dto.setEmpNo(rs.getString("emp_no"));
				dto.setFirstName(rs.getString("first_name"));
				dto.setLastName(rs.getString("last_name"));
				dto.setSalary(rs.getString("salary"));
				dto.setCount(rs.getString("count"));
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
