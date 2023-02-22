package ch03;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBookMain {
	static HashMap<String, String> number = new HashMap<>();

	public static void main(String[] args) {
		number.put("이순신", "010-4825-1967");
		number.put("진달래", "010-1955-0887");
		number.put("뭉치", "010-8004-1096");
		number.put("뽀삐", "010-0908-1774");
		number.put("무궁화", "010-2245-1028");

		// while 0종료 1저장 2전체조회 3선택조회 4선택삭제 5전체삭제
		Scanner scanner = new Scanner(System.in);
		String userInput = "-1";
		while (!userInput.equals("0")) {
			System.out.println(">>기능을 선택해주세요<<");
			System.out.println("0종료 1저장 2전체조회 3선택조회 4선택삭제 5전체삭제");
			userInput = scanner.nextLine();
			if (userInput.equals("1")) {
				System.out.println("저장할 전화번호를 입력해주세요");
				String newNumber = scanner.nextLine();
				System.out.println("저장할 이름을 입력해주세요");
				String newName = scanner.nextLine();
				System.out.println(newName + "  " + newNumber + " 를 새로 저장합니다");
				number.put(newName, newNumber);
			}
			if (userInput.equals("2")) {
				System.out.println("전화번호부를 전체조회합니다");
				System.out.println(">>전화번호부 목록<<");
				System.out.println(number);
			}
			if (userInput.equals("3")) {
				System.out.println("조회하실 전화번호부의 이름을 입력해주세요");
				String selectName = scanner.nextLine();
				System.out.println("요청하신 이름의 전화번호를 조회합니다");
				System.out.println(selectName + ": " + number.get(selectName));
			}
			if (userInput.equals("4")) {
				System.out.println("삭제하실 전화번호부의 이름을 입력해주세요");
				String removeName = scanner.nextLine();
				System.out.println("정말 삭제하시겠습니까? 1번을 눌러주세요!");
				int removeAnswer = scanner.nextInt();
				if (removeAnswer == 1) {
					System.out.println(removeName + "의 전화번호를 삭제합니다");
					number.remove(removeName);
					System.out.println(">>전화번호부 목록<<");
					System.out.println(number);
				} else {
					return;
				}
			}
			if (userInput.equals("5")) {
				System.out.println("전화번호부를 전체삭제합니다");
				number.clear();
				System.out.println(">>전화번호부 목록<<");
				System.out.println(number);
			}
		}
		System.out.println("프로그램 종료");
	}

}
