package ch03;

public class MainTest4 {
	// main 함수
	public static void main(String[] args) {
		
				// 증감 연산자(++)  ,  감소 연산자(--)
				int num1 = 1; //변수 선언과 동시에 초기화
				num1++;
				System.out.println(num1); // 2     변수의 값을 1 증가 시킬 때 사용
				
				int num2 = 1;
				num2 --;
				System.out.println(num2); //0   변수의 값을 1 감소 시킬 때 사용
				
				System.out.println("==============================");
				
				//1. 증감 연산자가 뒤에 올 경우
				int num3 = 10;
				int num4;
				// 증감 연산자가 뒤에 올 경우, num3 값이 num4로 들어감 > 이후에 증감 연산자 수행
				num4 = num3++;
				System.out.println(num4);  //10
				System.out.println(num3);  //11
				
				//2. 증감 연산자가 앞에 올 경우
				int num5 = 10;
				int num6;
				// 증감 연산자가 앞에 올 경우, 먼저 num5 변수에 접근해서 +1 증가 후 num6에 값 을 대입
				num6 = ++num5;
				System.out.println(num6); //11
				
				
				// 감소 연산자가 앞에 올 경우
				int num7 = 10;
				int num8;
				num8 = num7--;
				System.out.println(num8);  //10
				System.out.println(num7); //9
			
				// 감소 연산자가 뒤에 올 경우
				int num9 = 10;
				int num10;
				num10 = --num9;
				System.out.println(num10); //9
				
	} // end of main

} // end of class
