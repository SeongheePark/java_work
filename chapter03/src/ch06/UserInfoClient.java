package ch06;

import java.util.Scanner;

public class UserInfoClient {
	static String dbName = "Oracle";

	// main --> 실행하는 코드 작성 (사용 쪽 코드)
	public static void main(String[] args) {
		// UserInfoOracleDao 만들기
		// 스캐너를 통해서 사용자 이름, 사용자 비번 입력받기

		// 흐름 만들기
		// 1.저장기능 2.수정기능
		// dbName 변경해 가면서 코드 동작 확인해주세요
		Scanner scanner = new Scanner(System.in);
		System.out.println("사용자 이름을 입력해주세요");
		String userName = scanner.nextLine();
		System.out.println("사용자 비밀번호를 입력해주세요");
		String userPw = scanner.nextLine();

		UserInfo userInfo = new UserInfo(userName, userPw);

		IUserInfoDao dao;
		if (UserInfoClient.dbName.equals("Oracle")) {
			dao = new UserInfoOracleDao();
		} else {
			dao = new UserInfoMsSqlDao();
		}
		dao.insertUserInfo(userInfo);
	}

}
