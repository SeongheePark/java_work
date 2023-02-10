package Ex_01;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		// 시작값과 종료값을 받아 이중for문으로 구구단을 출력하는 프로그램을 만들어주세요
		Scanner scanner = new Scanner(System.in);
		System.out.println("출력하고 싶은 구구단 범위의 숫자 2개를 입력해주세요!");
		int firstNum = scanner.nextInt();
		int lastNum = scanner.nextInt();
		int step;

		for (step = 2; firstNum <= lastNum; firstNum++) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(firstNum + "*" + i + " = " + (firstNum * i));
			}
		}

	}

}
