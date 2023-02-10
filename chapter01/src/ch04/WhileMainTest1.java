package ch04;

public class WhileMainTest1 {
	// main 작업자
	public static void main(String[] args) {
		 //1~10까지 연산 코드
		int num = 1;
		int sum = 0;
		int userInput = 345;
		
		while(num <= userInput) {
			System.out.println("현재 값: "+ num);
//			sum = sum+num;
			sum += num;
			num++;
		}; //무한루프에 조심
			System.out.println("연산에 대한 결과 값은 : "+ sum + "입니다");
		
		
	} // end of main

} // end of class
