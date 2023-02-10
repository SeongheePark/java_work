package ch01;

public class DataType2 {
	// 코드의 시작점 - main 함수
	public static void main(String[] args) {

		char name; // 변수 선언, 2바이트 공간에 문자를 담을 수 있다
		char a;
		char initial;

		// 값을 초기화 하는 방법
		name = 'A'; // 홑 따옴표 사용해야한다.
		// name = 'ab'; 오류, 하나의 문자만 담을 수 있다(문자형 캐릭터 타입)
		name = 'b';
		System.out.println(name);

		System.out.println('p');
		System.out.println('C');

		// ctrl+F11 실행 단축키

	} // end of main

} // end of class
