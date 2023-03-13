package ch07;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

// 실제 DB 접근해서 기능을 처리
public class UserDAO implements IUserDAO {
	Scanner sc = new Scanner(System.in);
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

		try {
			pstmt = conn.prepareStatement(sql);
			System.out.println("조회할 이름을 입력해주세요!");
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
			for (int i = 0; i < list.size(); i++) {
				String name = list.get(i).getName();
				int age = list.get(i).getAge();
				String gender = list.get(i).getGender();
				System.out.println("**조회정보**");
				System.out.println(name + " " + age + " " + gender);
			}
			System.out.println();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int insert() {
		int insertInfo = 1;
		int backInfo = 2;
		int resultRowCount = 0;
		System.out.println("회원가입을 진행합니다!");
		System.out.println("이름을 입력해주세요");
		String insertName = sc.next();
		System.out.println("나이를 입력해주세요");
		int insertAge = sc.nextInt();
		System.out.println("성별을 입력해주세요");
		String insertGender = sc.next();
		System.out.println(insertName + " " + insertAge + " " + insertGender + " 정보로 회원가입을 진행합니다.");
		System.out.println("맞으면 1번, 다시 입력을 원하시면 2번을 눌러주세요!");
		int insertCheck = sc.nextInt();
		if (insertCheck == insertInfo) {
			System.out.println("가입이 완료되었습니다!");
			String sqlFormat = " INSERT INTO userTB(name, age, gender) " + "VALUES ('%s', '%d', '%s') ";
			String sql = String.format(sqlFormat, insertName, insertAge, insertGender);
			try {
				pstmt = conn.prepareStatement(sql);
				resultRowCount = pstmt.executeUpdate(sql);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else if (insertCheck == backInfo) {

		} else {
			System.out.println("잘못 입력하였습니다! 다시 입력해주세요");
		}
		return resultRowCount;
	}

	@Override
	public int update() {
		String sqlFormat;
		String sql = "";
		System.out.println("회원 정보 수정을 진행합니다");
		System.out.println("원하는 수정 메뉴를 선택해주세요");
		System.out.println("***1. 이름변경 2.나이변경 3.성별변경***");
		int updateMenu = sc.nextInt();
		if (updateMenu == 1) {
			sqlFormat = " UPDATE userTB " + "SET name = ? " + "WHERE name = ? ";
			System.out.println("회원가입 되어있는 이름을 입력해주세요!");
			String userName = sc.next();
			System.out.println(userName + "님! 새로 변경할 이름을 입력해주세요");
			String changeName = sc.next();
			sql = String.format(sqlFormat, changeName, userName);
		} else if (updateMenu == 2) {
			sqlFormat = " UPDATE userTB SET age = ? WHERE name = ? ";
			System.out.println("회원가입 되어있는 이름을 입력해주세요!");
			String userName = sc.next();
			System.out.println(userName + "님! 새로 변경할 나이를 입력해주세요");
			int changeAge = sc.nextInt();
			sql = String.format(sqlFormat, changeAge, userName);
		} else if (updateMenu == 3) {
			sqlFormat = " UPDATE userTB SET gender = ? WHERE name = ? ";
			System.out.println("회원가입 되어있는 이름을 입력해주세요!");
			String userName = sc.next();
			System.out.println(userName + "님! 새로 변경할 성별을 입력해주세요");
			String changeGender = sc.next();
			sql = String.format(sqlFormat, changeGender, userName);
		}
		int resultRow = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			resultRow = pstmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("수정을 완료했습니다!");
		return resultRow;
	}

	@Override
	public void delete() {
		System.out.println("회원정보 삭제를 진행합니다");
		System.out.println("회원정보를 삭제할 이름을 입력해주세요");
		String deleteName = sc.next();
		String sqlFormat = "DELETE FROM userTB " + "WHERE name = '%s' ";
		String sql = String.format(sqlFormat, deleteName);
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("삭제를 완료했습니다!");
	}

}// end of class
