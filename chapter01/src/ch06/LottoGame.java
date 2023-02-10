package ch06;

//Random class파일 > LottoGame.java 파일로 가져오기
import java.util.Random;

public class LottoGame {
	static void myPrintln(int n1,int n2, int n3, int n4, int n5, int n6) {
		String str = ""+ n1 + ","+ n2 + ","+n3+","+n4+","+n5+","+n6;
		System.out.println(str);
	}

	// 함수를 만들 때 반드시 어떠한 기능을 만들지 정의하고 코드 작성해주세요
	// 랜덤 숫자 하나를 반환하는 기능을 만들어보자!
	static int randomNumber() {
		// JDK가 만들어 준 도구 이용
		Random random = new Random();
		// 랜덤 값을 하나 생성해서 반환 --> bound 45
		// 0부터 시작한다 --> 0~44 반환 -->
		int resultNumber = random.nextInt(45) + 1;
		return resultNumber;
	}

	// 코드 실행 메인함수
	public static void main(String[] args) {
		// System.out.println(randomNumber());
		int r1 = randomNumber();
		int r2 = randomNumber();
		int r3 = randomNumber();
		int r4 = randomNumber();
		int r5 = randomNumber();
		int r6 = randomNumber();
		System.out.println(r1+":"+r2+":"+r3+":"+r4+":"+r5+":"+r6);
		
		
//		System.out.println("aaa");
//		System.out.println(r1, r2, r3, r4, r5, r6);
//		myPrintln(r1,r2, r3, r4, r5, r6);
//		

	}// end of main

}
