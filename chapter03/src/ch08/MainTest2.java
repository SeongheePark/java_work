package ch08;

public class MainTest2 {

	public static void main(String[] args) {
		// 예외 처리 구문 작성
		// 10/0 연산시키고 예외처리까지 작성해주세요

		// try-catch
		int n1 = 10;
		int n2 = 0;
		try {
			System.out.println(n1 / n2);
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다!");
		}
		
		Calculator calculator = new Calculator();
		

	}
}

class Calculator {
	
}
