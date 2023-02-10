package ch03;

public class MainTest6 {

	public static void main(String[] args) {

		// 논리 연산자 (&&엠버센트, ||버티컬바 )
		// 논리곱 && 논리합 || 부정 !
		// 연산의 결과값은 true, false 이다.
		// 보통 비교연산자와 함께 많이 사용된다.

		int num1 = 10;
		int num2 = 20;

		boolean flag1 = (num1 > 0)  &&  ( num2 > 0);
		System.out.println(flag1);  //true

		boolean flag2 = (num1 > 0) || (num2 > 0);
		System.out.println(flag1); // true
		
		//  논리곱은 반드시 전부 T일때만 T이다.
		flag1 = (num1 > 0) && (num1 <0);
		System.out.println(flag1); //false 
		System.out.println(!flag2); //true   ! 자체를 부정해주면 반대가 된다.
		
		// 논리합은 여러개 중 하나라도 T이면 T이다.
		boolean flag3 = (num1 > 0 ) || (num2 < 0);
		System.out.println(flag3); //true

	} // end of main

} // end of class
