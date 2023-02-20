package ch05;

import java.util.Scanner;

// 윤년 계산기 만들기
public class YearTest {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("확인할 연도를 입력해주세요!");
			int year = scanner.nextInt();
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.println(year + "년은 윤년입니다!");
			} else {
				System.out.println(year + "년은 평년입니다!");

			}

		}
	}
