package ch04;

import java.util.Scanner;

public class ifMainTest1 {

	public static void main(String[] args) {
		// 제어문 if
		// 주어진 조건에 따라서 실행이 이루어지도록 구현
		// 만약 ~이라면

		boolean flag = true;

		// if문 단독 - 출력이 될 수도, 안될 수도 있다
		if (flag) {
			System.out.println("조건식의 결과가 true이면 여기 코드가 수행 됩니다.");
		} // end of if

		// if else 문 - 둘 중 하나는 무조건 출력
		flag = false;
		if (flag) {
			System.out.println("true면 실행!");
		} else {
			System.out.println("false면 실행@@");
		}

		System.out.println("성적을 입력하시오");
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();

		// 성적 입력해보기
		if (point >= 90) {
			System.out.println("A학점 입니다!");
		} else if (point >= 80) {
			System.out.println("B학점 입니다!");
		} else if (point >= 70) {
			System.out.println("C학점 입니다!");
		} else if (point >= 60) {
			System.out.println("D학점 입니다!");
		} else {
			System.out.println("F학점 입니다!");
		} //end of if

	}
}
