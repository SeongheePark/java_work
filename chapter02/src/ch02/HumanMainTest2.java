package ch02;

import java.util.Scanner;

public class HumanMainTest2 {

	public static void main(String[] args) {

		Human human = new Human();
		// 스캐너를 활용해서 값을 할당해주세요
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요!");
		human.name = sc.nextLine();
		System.out.println("키를 입력해주세요!");
		human.height = sc.nextInt();
		System.out.println("몸무게를 입력해주세요!");
		human.weight = sc.nextInt();
		System.out.println("남자인가요? true/false로 대답해주세요!");
		human.isMan = sc.nextBoolean();

		// 마지막에는 showInfo 메서드 호출
		// 0번을 누르면 showInfo 호출
		System.out.println("입력한 정보를 확인하시겠습니까? 0번을 입력해주세요!");
		int result = sc.nextInt();
		if (result == 0) {
			human.showInfo();
		}

	}

}
