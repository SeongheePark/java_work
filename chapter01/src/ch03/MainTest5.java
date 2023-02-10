package ch03;

public class MainTest5 {

	public static void main(String[] args) {
		
			// 관계 연산자 (비교 연산자)
			// 관찰의 결과가 참, 거짓으로 판별할 때 사용한다
			// 결과는 오직 true, false로 반환 
		
			int num1 = 5;
			int num2 = 3;
			
			//	5 > 3;
			System.out.println(5 > 3);
			// 주어를 관계 연산자로 바라보기
			boolean value1 = 5 > 3; //true
			System.out.println(value1);
			
			boolean value2 = 5 < 3;
			System.out.println(value2); //false
			
			boolean value3 = num1 == num2;
			System.out.println(value3); //false
			
			boolean value4 = num1 != num2;
			System.out.println(value4); //true

	} //end of main

} //end of class
