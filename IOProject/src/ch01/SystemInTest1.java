package ch01;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) {
		// 키보드에서 데이터를 프로그램 안으로 넣기
		System.out.println("알파벳 하나 쓰고 Enter를 누르세요");

		// 기반 스트림 --> 키보드에 파이프를 연결해서 하나씩 출력 - 많이 받으려면 기능확장 해야함. 편하게 쓰려면 scanner
		// 1byte씩 입력값을 받다보니 한국어, 중국어, 일본어 표현하기 어려움
		// 유니코드 : 전세계 문자열 표준 (최대 4byte) utf-8 (1-4byte 동적으로 줄었다늘었다)
		int i;
		// 한 바이트씩 키보드의 값을 입력받아 읽어라
		try {
			// 입력
			i = System.in.read();
			// 출력
			System.out.println(i);
			System.out.println((char) i); // ab - 입력해도 a 하나만 출력
			// 컴퓨터 문자표 (미리 약속) : 정수값을 문자열로 변환하는 것 ---> 인코딩 (반대는 디코딩)
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
