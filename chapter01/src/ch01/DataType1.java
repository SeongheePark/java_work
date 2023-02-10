package ch01;

public class DataType1 {

	// 코드 시작점 main함수
	public void main(String[] args) {

		// 데이터 타입의 종류 (크게 2가지)
		// 1. 기본 데이터 타입(primitive data type)
		// 2. 참조 타입 (Reference Type)

		// 정수형(1, 10, 300) 데이터 타입
		// 크기가 다를 수 있다
		byte b; // 1바이트 크기 (8bit)
		short s; // 2바이트 크기 (16bit)
		int i; // 4바이트 크기 (32bit)
		long l; // 8바이트 크기(64bit)

		b = 127;
		b = -128;
		// 데이터 타입 byte는 127부터 -128까지 담을 수 있다. 나머지 오류.

		s = 128;
		// s = 200000000;

		// int는 약 +-21억 까지의 정수를 담을 수 있다
		i = 210_000_000;
		 // i = 2_200_000_000; 

		// 컴퓨터 정수값의 기본 단위는 int 이다.
		l = 220000000L; // <- 접미사를 붙여 주어야 한다.(long의 약자 L)

		// 예제
		// short 데이터 타입의 범위는?
		s = -32768;
		s = 32767;

	} // end of main

} // end of class
