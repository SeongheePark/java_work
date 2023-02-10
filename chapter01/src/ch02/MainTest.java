package ch02;

public class MainTest {
	// 코드의 시작점 main함수
	public static void main(String[] args) {
		// long - 8byte
		// int - 4 byte
		// 작은 상자에서 큰 상자로 들어갈 때는 자동 형 변환

		long l = 100; // <-- 자동 형 변환
		// R value --> 정수 값의 기분 단위인 int 형이다
		// L value --> long 데이터 타입을 int 형 데이터를 넣는 과정이기 때문에 자동형 변환이다.
		System.out.println(" l : " + l);

	} // end of main

} // end of class
