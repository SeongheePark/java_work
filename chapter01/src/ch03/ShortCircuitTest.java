package ch03;

public class ShortCircuitTest {

	public static void main(String[] args) {
		// 관계 논리곱 논리합

		int num1 = 5;
		int i = 0;

		boolean value = ((num1 += 10) < 10) && ((i += 2) < 10);
		System.out.println(value);
		System.out.println(num1); // 15
		// short circit
		System.out.println(i); // 0

		value = ((num1 += 10) < 10) || ((i += 2) < 10);
		System.out.println(value);
		System.out.println(i);
		
		
		//문제
		// short circuit 평가 문제를 직접 2문제 만들어주세요
		
		
		int number = 10;
		int k = 2;
		//문제 1번 -  논리합일 경우, 하나만 T여도 결과가 T이다
		boolean result = ((number += 5) < 20 ) || ((k += 1) < 3);
		// number += 5) < 20 가 참이므로 뒤 연산은 일어나지 않음
		System.out.println(result); //true
		System.out.println(k); //2
		
		//문제 2번 - 논리곱일 경우, 두 항 모두 참일 경우만 결과가 T이다
		result = ((number -= 10) > 8) && ((k *= 2) > 2);
		// (number -= 10) < 8 가 거짓이므로 뒤 연산은 일어나지 않음 
		System.out.println(result); //false
		System.out.println(k); //2

	} // end of main

} // end of class
