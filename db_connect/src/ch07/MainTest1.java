package ch07;

import java.util.Scanner;

public class MainTest1 {

	public static void main(String[] args) {
		UserDAO userDAO = new UserDAO();
		Scanner sc = new Scanner(System.in);

		int insert = 1;
		int select = 2;
		int update = 3;
		int delete = 4;

		while (true) {
			System.out.println("*** Home Page ***");
			System.out.println("*** 원하는 메뉴를 선택해주세요 ***");
			System.out.println("*** 1. 회원가입 ***");
			System.out.println("*** 2. 회원정보조회 ***");
			System.out.println("*** 3. 회원정보수정 ***");
			System.out.println("*** 4. 회원정보삭제 ***");
			int choiceMenu = sc.nextInt();
			if (choiceMenu == insert) {
				userDAO.insert();
			}
			if (choiceMenu == select) {
				userDAO.select();
			}
			if (choiceMenu == update) {
				userDAO.update();
			}
			if (choiceMenu == delete) {
				userDAO.delete();
			}
		}
	}
}
