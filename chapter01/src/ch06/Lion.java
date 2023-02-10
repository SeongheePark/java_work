package ch06;

import java.util.Scanner;

/**
 * 함수를 선언하는 코드 방법 함수를 사용하는 코드 방법
 *
 */
public class Lion {
	// 함수를 설계하는 코드 작성
	// 함수의 선언부
	// 정수를 반환하는 함수
	static int addNumber(int n1, int n2) {
		// 함수 구현부(body)
		int result; // 지역변수
		result = n1 + n2;
		return result; // return 키워드를 만나면 실행의 제어권을 반납한다.(데이터)
	}

	// 아무것도 반환하지 않는 함수 - void
	static void sayHello(String name) {
		System.out.println(name + "반갑습니다 ~");
	}

	// 매개 변수가 없는 함수를 설계
	static int calcSum() {
		int sum = 0;
		int i;

		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}

	// calcSum2, 정수값 3개를 받아서 덧셈 연산 후 결과를 반환하시오(return타입 double)
	static double calcSum2(int n1, int n2, int n3) {
		double result;
		result = n1 + n2 + n3;
		return result;
	}

	// calcSum3 정수값1, 실수값1, 논리값 1개 받고 "정수값:" [] "실수값:" [] "논리값:" [] <--문자열 연산/
	// return 타입 String
//	static String calcSum3(int n1, double n2, boolean n3) {
//		  String result = n1 + n2 + n3;
//		return result;
	static String calcSum3(int n1, double n2, boolean n3) {
		String result = "정수값: " + n1 + "실수값: " + n2 + "논리값: " + n3;
		return result;
	}

	// main함수 - 텅 빈, return 값이 없다.
	public static void main(String[] args) {
		// 함수 호출하기
		// 함수를 사용하는 코드
		int myNumber = addNumber(5, 10);
		System.out.println("myNumber" + myNumber);

		// 함수 호출2
		// 함수 호출할 때는 모양 맞추기이다.
		sayHello("애쉬");
		sayHello("티모");
		sayHello("바론");
		// int a = myNumber;

		int calResult = calcSum();
		System.out.println(calResult);
		System.out.println((calcSum()));

		// 함수 호출3
		System.out.println((calcSum2(5, 10, 15)));
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 3개를 입력해주세요!");
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		int n3 = sc.nextInt();
//		System.out.println((calcSum2(n1,n2,n3)));

		// 함수 호출4
		String localDataString = calcSum3(100, 0.5, true);
		System.out.println(localDataString);
	} // end of main
	
	// 함수란?
	// 자바에서 객체와 상관없이 독립적으로 어떠한 기능을 수행하는 일련의 코드묶음

}// end of class
