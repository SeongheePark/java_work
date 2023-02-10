package ch04;

import java.util.Scanner;

public class WhileMainTest2 {
	// main작업자 (메인쓰래드)
	public static void main(String[] args) {
		int num;
		int sum = 0;
		int userInput;
		Scanner scanner = new Scanner(System.in);
//		System.out.println("덧셈 정수값을 입력해주세요");
		// 조건 : 사용자가 0을 입력하면 프로그램 종료하도록 설계
		// 0이 아니라면 사용자가 입력한 값을 계속 덧셈해서 sum에 담아주세요
		// do-while문으로 코드를 작성해주세요

		do {
			System.out.println("덧셈 정수값을 입력해주세요");
			userInput = scanner.nextInt();
			sum += userInput;
			System.out.println("연산된 값: " + sum);
		} while (userInput == 0);

		do {
			num = scanner.nextInt();
			sum += num;
		} while (num != 0);
		System.out.println("연산된 결과는 " + sum + " 입니다");

	} // end of main

} // end of class
